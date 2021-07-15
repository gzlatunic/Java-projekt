#ifndef LU_H
#define LU_H

#include "matrica.h"

class LU_dekompozicija{
    public:
        LU_dekompozicija(int velicina);

        int N = 3; // STA JE OVO
        Matrica *U;
        Matrica *L;
        Matrica *y;
        Matrica *x;
        Matrica *mk;

        void dekompozicija(Matrica &A);
        void supstitucija_forward(Matrica &b);
        void supstitucija_backward();

        int mnozi(Matrica *m1, Matrica *m2, Matrica *y);
};

#endif