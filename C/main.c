#include <stdio.h>
#include <stdlib.h>

typedef struct coord{
	int x, y;
}Coord;

Coord ConstructPoint1()
{
Coord t0;
	t0.x = rand()%1024;
	t0.y = rand()%768;
	return t0;
}

void modif(Coord *pt)
{
	pt = pt->x+1;
	if (pt->x > 1000) {
		pt->x = 0;
	}
	pt->x = 0;

}

int main()
{
	Coord * p = {10, 20};
	printf("p.x = %d, p.y = %d\n", p->x, p->y);
	modif(&p);
	printf("p.x = %d, p.y = %d\n", p->x, p->y);
	return 0;
}