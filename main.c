#include <stdio.h>
#include <stdlib.h>
#include <locale.h> // research this lib

#include "constructs.h"

#define MAX_SENTENCE_LENGTH 255;


int main(int argc, char** argv) {

  // Set locale to all
  char *locale;

  locale = setlocale(LC_ALL, "");


  // Some examples?
  char *test_1 = (char*) malloc(sizeof(char) * MAX_SENTENCE_LENGTH);
  char *test_2 = (char*) malloc(sizeof(char) * MAX_SENTENCE_LENGTH);

  (void) sprintf(test_1, "%sx,%sy(f(x,y) = f(y,x) %s x = y)", universal_quant, universal_quant, implication);
  (void) sprintf(test_2, "%sx,%sy(R(x,y) %s R(y,x) %s x = y)", universal_quant, universal_quant, and, implication);
  
  printSentence(test_1);
  printSentence(test_2);

  return 0;
}

void printSentence(char *sentence) {
  fprintf(stdout, "Your sentence is: \n%s\n", sentence);
}
