#include <cstdlib>
#include <cwchar>
#include <iostream>
#include <string>

#include "language.h"
#include "sentence_symbol.h"
#include "internal_sentence_tree.h"
#include "generator_sentence_tree.h"

using namespace std;

int main(int argc, char **argv) {

  cout << UNIVERSAL_QUANT << '\n';
  cout << EXISTENTIAL_QUANT << '\n';
  cout << NOT << '\n';
  cout << IMPLICATION << '\n';
  cout << AND << '\n';
  cout << OR << '\n';
  
  return 0;
  
}
