#include "grains.h"
#include <limits.h>

uint64_t square(uint8_t index) {
    if (index > 0 && index < 65) return 1ULL << (index - 1);
    return 0;
}

uint64_t total(void) {
    return UINT64_MAX;    
}