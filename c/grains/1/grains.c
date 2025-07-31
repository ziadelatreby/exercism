#include "grains.h"
#include <math.h>
#include <stddef.h>

uint64_t square(uint8_t index) {
    return pow(2, (index - 1));
}

uint64_t total(void) {
    uint64_t t = 0;
    for (size_t i = 1; i < 65; i++) {
        t += square(i);
    }
    return t;
}
