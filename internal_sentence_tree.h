#ifndef __INTERNAL_SENTENCE_TREE_H__
#define __INTERNAL_SENTENCE_TREE_H__

#include "sentence_symbol.h"

class Term {

private:
  // strings with variables, constants, and functions
  Symbol root_symbol;
  Term branches[];

public:
  Term();
  
  string term_to_string();
  
  ~Term();

};

class Atomic_Formula {

private:
  // strings of the form, Rt_1t_2...t_n and =t_1t_2, where R is a relation  
  Symbol root_symbol;
  Term branches[];

public:
  Atomic_Formula();

  string atomic_formula_to_string();
  
  ~Atomic_Formula();
  
};

class Formula {

  // Freely generated collection of the above sets

};

class Sentence {

  // Subset with no of formulas with no free variables
  
};

#endif
