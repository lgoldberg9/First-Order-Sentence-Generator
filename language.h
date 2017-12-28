#include <list>

#include "sentence_symbol.h"

using namespace std;

class first_order_language {

  list<constant> constants;
  list<function> functions;
  list<relation> relations;

  first_order_language() {
    
  }

  ~first_order_language() {}

};
