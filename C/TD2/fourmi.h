#include <stdlib.h>
#include <stdio.h>

typedef struct Fourmi Fourmi;
struct Fourmi {

    int x; //Abscisses
    int y; //Ordonnées
    
    int dx;//Vitesse en abscisse
    int dy; //Vitesse en ordonnée

    int R;
    int G;
    int B;

    char graph;
};

Fourmi init();
void avance(Fourmi *pt_fourmi);
void afficheP(Fourmi *pt_fourmi);