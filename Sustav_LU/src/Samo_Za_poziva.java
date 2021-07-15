/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabrijela
 */
public class Samo_Za_poziva {
    
    public static void main(String[] args){
        Matrica proba = new Matrica(2);
        
        
        double[][] t = {{1, 1}, {-3, 1}};
        proba.setMat(t);
        
        double[] b =  {6, 2};
        for(int i = 0; i < proba.dimenzija; i++){
            for(int j= 0; j < proba.dimenzija; j++){
                System.out.print(proba.matrica[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Determinanta probne matrice: " + proba.determinanta());
        
        Matrica inv = proba.inverz();
        for(int i = 0; i < inv.dimenzija; i++){
            for(int j= 0; j < inv.dimenzija; j++){
                System.out.print(inv.matrica[i][j] + "  ");
            }
            System.out.println();
        }
        Sustav p = new Sustav();
        double[] rj = p.riješiJednadžbu(proba, b);
        for(int i = 0; i < rj.length; i++){
            System.out.print(rj[i] + "  ");
        }
        System.out.println();
    }
}
