#ifndef MATRICA_H
#define MATRICA_H

#include <iostream>
#include <cstdlib>
#include <ctime>
#include <iomanip>
#include <string>

using namespace std;

class Matrica{
    public:
        Matrica(int M, int N, string ime, int tip);
        ~Matrica();

        double **mat;
        int redovi;
        int stupci;
        string ime;
        int tip;

        const static int kao_matrica = 1;
        const static int kao_vektor = 2;

        void ispis();
        //Treba unijeti podatke i nekako ih povezati
        void dodajElemente();
};

#endif