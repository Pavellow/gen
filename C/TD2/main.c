#include <stdlib.h>
#include <stdio.h>
#include "fourmi.h"
#include <time.h>

Fourmi init() {
    Fourmi fourmi;
    fourmi.x = rand() % 400 +1;
    fourmi.y = rand() % 200 +1;
    fourmi.dx = rand() % 40 +1;
    fourmi.dy = rand() % 20 +1;
    fourmi.R = rand() % 255 +1;
    fourmi.G = rand() % 255 +1;
    fourmi.B = rand() % 255 +1;
    fourmi.graph = 65 + rand()%25;

    return fourmi;

}

int main(int argc, const char * argv[]) {
    srand(time(NULL));
    Fourmi fourmi = init();
    printf("X: %d\nY: %d\ndX: %d\ndY: %d\nR: %d\n G: %d\nB: %d\n%d\n", fourmi.x, fourmi.y, fourmi.dx, fourmi.dy, fourmi.R, fourmi.G, fourmi.B, fourmi.graph);
    return 0;
}