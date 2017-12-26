#include <stdio.h>
#include <stdlib.h>
#include <wchar.h>
#include <locale.h> // research this lib

#include "constructs.h"

#define MAX_SENTENCE_LENGTH 255

void printSentence(char *sentence) {
  fprintf(stdout, "Your sentence is: \n%s\n", sentence);
}

int main(int argc, char** argv) {

  // Set locale to all
  char *locale =setlocale(LC_ALL, "C.UTF-8");

  // Some examples?
  char *test_1 = (char*) malloc(sizeof(char) * MAX_SENTENCE_LENGTH);
  char *test_2 = (char*) malloc(sizeof(char) * MAX_SENTENCE_LENGTH);

  (void) sprintf(test_1, "%lcx,%lcy(f(x,y) = f(y,x) %lc x = y)", universal_quant, universal_quant, implication);
  (void) sprintf(test_2, "%lcx,%lcy(R(x,y) %lc R(y,x) %lc x = y)", universal_quant, universal_quant, and, implication);
  
  printSentence(test_1);
  printSentence(test_2);

  return 0;
}
