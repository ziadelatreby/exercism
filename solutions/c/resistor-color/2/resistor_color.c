#include "resistor_color.h"

static const resistor_band_t colors_array[COLORS_NUM] = { COLORS };

uint8_t color_code(resistor_band_t color) {
    return color;
}

const resistor_band_t* colors(void) {
    return colors_array;
}