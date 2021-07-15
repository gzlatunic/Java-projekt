/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabrijela
 */
public class Matrica {
    
    int dimenzija;
    double[][] matrica;
    
    public Matrica(int dim){
        this.dimenzija = dim;
        this.matrica = new double[dim][dim];
    }
    public void setDim(int dim){
        this.dimenzija = dim;
    }
    public int getDim(){
        return this.dimenzija;
    }
    
    public void setMat(double[][] mat){
        this.dimenzija = mat.length;
        for(int i = 0; i < this.dimenzija; i++){
            for (int j = 0 ; j < dimenzija; j++){
                this.matrica[i][j] = mat[i][j];
            }
        }
    }
    
    public double[][] getMat(){
        return this.matrica;
    }
    
    public double[] redak(int red){
        double[] r = new double[this.dimenzija];
        for(int i = 0; i < this.dimenzija; i++){
            r[i] = this.matrica[red][i];
        }
        return r;
    }
    
    public double[] stupac(int stup){
        double[] s = new double[this.dimenzija];
        for(int i = 0; i < this.dimenzija; i++){
            s[i] = this.matrica[i][stup];
        }
        return s;
    }
    public Matrica izbaciSR(int s, int r){
        Matrica nova = new Matrica(this.dimenzija - 1);
        
        for(int i = 0; i < nova.dimenzija; i++){
            if(i < r){
                for(int j = 0; j < nova.dimenzija; j++){
                    if(j < s){
                        nova.matrica[i][j] = this.matrica[i][j];
                    }
                    else
                        nova.matrica[i][j] = this.matrica[i][j+1];
                }
            }
            else {
                for(int j = 0; j < nova.dimenzija; j++){
                    if(j < s){
                        nova.matrica[i][j] = this.matrica[i+1][j];
                    }
                    else
                        nova.matrica[i][j] = this.matrica[i+1][j+1];
                }
            }
        }
        return nova;
    }
    public double determinanta(){
        
        if(this.dimenzija == 1)
            return this.matrica[0][0];
        if(this.dimenzija == 2)
            return this.matrica[0][0] * this.matrica[1][1] - this.matrica[0][1] * this.matrica[1][0];
        
        double det = 0;
        Matrica temp = new Matrica(this.dimenzija - 1);
        int sign = 1;
        for(int i = 0; i < this.dimenzija; i++){
            if(i % 2 == 0)
                sign = 1;
            else
                sign = -1;
            temp = this.izbaciSR(i,0);
            det += sign *this.matrica[0][i] * temp.determinanta();
        }
        return det;
    }
    public Matrica minore(){
        Matrica vrati = new Matrica(this.dimenzija);
        Matrica temp = new Matrica(this.dimenzija - 1);
        int sign = 1;
        for(int i = 0; i < this.dimenzija; i++){
            for(int j = 0; j < this.dimenzija; j++){
                temp = this.izbaciSR(j,i);
                vrati.matrica[i][j] = Math.pow(-1, i+j) * temp.determinanta();
            }
        }
        return vrati;
    }
    
    public Matrica inverz(){
        // Matrica adjunkti bez transponiranja
        Matrica inverz= new Matrica(this.dimenzija);
        inverz = this.minore();
        
        // Sada transponiraj tu matricu
        Matrica temp = new Matrica(inverz.dimenzija);
        for(int i = 0; i < inverz.dimenzija; i++){
            for(int j = 0; j < inverz.dimenzija; j++){
                temp.matrica[i][j] = inverz.matrica[j][i];
            }
        }
        
        // I podijeli s determinantom početne matrice
        double d = this.determinanta();
        for(int i = 0; i < inverz.dimenzija; i++){
            for(int j = 0; j < inverz.dimenzija; j++){
                inverz.matrica[i][j] =  temp.matrica[i][j] / d;
            }
        }
        
        return inverz;
    }
    
    public double[] množiMatricom(double[] b){
        double[] rješenje = new double[this.dimenzija];
        
        for(int i = 0; i < this.dimenzija; i++){
            double el = 0;
            for(int j = 0; j < this.dimenzija; j++){
                el += this.matrica[i][j] * b[j];
            }
            rješenje[i] = el;
        }
        
        return rješenje;
    }
}
