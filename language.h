#ifndef __LANGUAGE_H__
#define __LANGUAGE_H__
#include <list>

#include "sentence_symbol.h"

using namespace std;

class first_order_language {

  list<Constant> constants;
  list<Function> functions;
  list<Relation> relations;

  first_order_language() {
    
  }

  ~first_order_language() {}

};
#endif
