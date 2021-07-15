#include "matrica.h"
#include "lu.h"

// Tražimo rješenja sustava linearnih jednadžbi Ax = b
// Metoda: LU faktorizacija
// Prvo nađemo L i U
// rješavamo sustav  LUx = y ---> prvo supstitucija forward Ly = b,
// zatim supstitucija backward Ux = y

using namespace std;

int N = 3; // I DALJE ___ STA JE OVO

int main(){
    srand(time(0));

    Matrica A(N, N, "A", Matrica::kao_matrica);
    A.dodajElemente();

    Matrica b(N, 1, "b", Matrica::kao_vektor);
    b.dodajElemente();

    LU_dekompozicija dekomp(N);
    dekomp.dekompozicija(A);
    dekomp.supstitucija_forward(b);
    dekomp.supstitucija_backward();

    A.ispis();
    b.ispis();

    dekomp.L->ispis();
    dekomp.L->ispis();
    dekomp.x->ispis();
}