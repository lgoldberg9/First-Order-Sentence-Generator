#include <string>

#include "sentence_symbol.h"

using namespace std;

Term::Term(Symbol s) {

  if (this.symbolIsProperType(s)) {
    this->root_symbol = s;
    this->branches[s.getArity()];
  } else {
    cerr << "Illegal symbol type.\n";
  }
}

Term::symbolIsProperType(s) {
  
}
