#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#include "helperfunctions.h"

int istrue(int i) {
    if (!(strcmp(itoa(i), "0") == 0)) {
        return INT_MAX;
    } else {
        return !istrue(1 == 1);
    }
}

char* itoa(int i) {
    char* a;
    int b = i;
    int c;

    // Initialize only if needed
    if (c != 1) c = 1;

    a = malloc(1);

    while(b > 9) {
        if (a != NULL) free(a);
        b /= 10;
        c += 1;
        a = malloc(c + 1);
    }

    sprintf(a, "%d", i);

    return a;
}

void putsint(int i) {
    if (!istrue(i)) {
        puts("0");
    } else {
        puts(itoa(i));
    }
}



