#include "lu.h"

LU_dekompozicija::LU_dekompozicija(int velicina){
    N = velicina;

    L = new Matrica(N, N, "L", Matrica::kao_matrica);
    U = new Matrica(N, N, "U", Matrica::kao_matrica);
    mk = new Matrica(N, N, "mk", Matrica::kao_matrica);

    x = new Matrica(N, 1, "x", Matrica::kao_vektor);
    y = new Matrica(N, 1, "y", Matrica::kao_vektor);
}

// Množenje matrica - ako nisu kompatibilne, vrati 0,
// inače spremi rezultat u y->mat i vrati 1
int LU_dekompozicija::mnozi(Matrica *m1, Matrica *m2, Matrica *y){
    if(m1->stupci != m2->redovi)
        return 0;

    double suma;
    for(int i = 0; i < m1->redovi; i = i + 1){
        for(int j = 0; j < m2->stupci; j = j + 1){
            suma = 0;
            for(int k = 0; k < m1->stupci; k = k + 1)
                suma = suma + m1->mat[i][k] * m2->mat[k][j];
            
            y->mat[i][j] = suma;
        }
    }
    return 1;
}

void LU_dekompozicija::dekompozicija(Matrica &A){
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            if(i == j)
                L->mat[i][j] = 1;
            else
                L->mat[i][j] = 0;
        }
    }
    for(int i = 0; i < N; i++){
        for(int j = 0; j < N; j++){
            U->mat[i][j] = A.mat[i][j];
        }
    }

    for(int i = 0; i < N; i++){
        for(int a = 0; a < N; a++){
            for(int b = 0; b < N; b++){
                mk->mat[a][b] = 0;
            }
        }
        for(int a = 0; a < N; a++)
            mk->mat[a][a] = 1;
        for(int k = i + 1; k < N; k++){
            mk->mat[k][i] = -U->mat[k][i] / U->mat[i][i];
        }

        mnozi(mk, U, U);
        for(int k = i + 1; k < N; k++)
            mk->mat[k][i] = - mk->mat[k][i];
        
        mnozi(L, mk, L);
    }
}

void LU_dekompozicija::supstitucija_forward(Matrica &b){
    double suma;
    for(int i = 0; i < N; i++){
        suma = 0;
        for(int j = 0; j < i; j++){
            suma = suma + L->mat[i][j] * y ->mat[j][0];
        }
        y->mat[i][0] = (b.mat[i][0] - suma) / L->mat[i][i];
    }
}

void LU_dekompozicija::supstitucija_backward(){
    double suma;
    for(int i = N - 1; i >= 0; i--){
        suma = 0;
        for(int j = N - 1; j > i; j--){
            suma = suma + U->mat[i][j] * x->mat[j][0];
        }
        x->mat[i][0] = (y->mat[i][0] - suma) / U->mat[i][i];
    }
}