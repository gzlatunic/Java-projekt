#include "matrica.h"

// Konstruktor
Matrica::Matrica(int M, int N, string c_ime, int c_tip){
    redovi = M;
    stupci = N;
    ime = c_ime;
    tip = c_tip;

    mat = new double*[redovi];
    for(int i = 0; i < redovi; i = i+ 1){
        mat[i] = new double[stupci];
    } 
}
// Destruktor
Matrica::~Matrica(){
    for(int i = 0; i < redovi; i = i + 1){
        delete[]mat[i];
    }
    delete []mat;
}

void Matrica::ispis(){
    if(tip == kao_matrica){
        cout << "Matrica "<< ime << ":" <<endl;
        for(int i = 0; i < redovi; i = i + 1){
            for(int j = 0; j < stupci; j = j + 1){
                cout << mat[i][j] << "  ";
            }
            cout << endl;
        }
        cout << endl;
    }
    else if(tip == kao_vektor){
        cout << "Vektor " << ime << ": " << endl;
        for(int i = 0; i < redovi; i = i + 1){
            cout << mat[i][0] << "  ";
        }
        cout << endl;
    }
}

void Matrica::dodajElemente(){
    if(tip == kao_matrica){
        mat[0][0] = 2;
        mat[0][1] = -2;
        mat[0][2] = 1;

        mat[1][0] = 1;
        mat[1][1] = 3;
        mat[1][2] = -2;

        mat[2][0] = 3;
        mat[2][1] = -1;
        mat[2][2] = -1;
    }

    if(tip == kao_vektor){
       // mat = {-3, 1, 2};
       mat[0][0] = -3;
       mat[1][0] = 1;
       mat[2][0] = 2;
    }
}