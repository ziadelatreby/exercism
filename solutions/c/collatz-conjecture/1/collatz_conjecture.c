#include "collatz_conjecture.h"

int steps(int start) {
  int steps = 0;
  while (start != 1) {
    start = (start % 2 == 0) ? start / 2 : start * 3 + 1;
    steps++;
  }
  return steps;
}