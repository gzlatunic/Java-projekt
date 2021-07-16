/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabrijela
 */
public class Sustav {
    double[] rješenje;
    
    public Sustav(){
        rješenje = null;
    }
    public void setRjesenje(double[] t){
        this.rješenje = t;
    }
    public double[] getRjesenje(){
        return this.rješenje;
    }
    public double[] riješiJednadžbu(Matrica A, double[] b){
        double[] rješenje = new double[A.dimenzija];
        
        // Prvo dohvati inverz matrice A
        Matrica A_inverz = A.inverz();
        
        // Sada množi A_inverz i b
        rješenje = A_inverz.množiMatricom(b);
        
        return rješenje;
    }
}
