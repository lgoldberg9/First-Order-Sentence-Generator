#ifndef __SENTENCE_SYMBOL_H__
#define __SENTENCE_SYMBOL_H__
#include <string>

using namespace std;

const string UNIVERSAL_QUANT = "∀";
const string EXISTENTIAL_QUANT = "∃";
const string IMPLICATION = "⇒";
const string NOT = "¬";
const string AND = "∧";
const string OR = "∨";

class Symbol {
protected:
  int arity;
  string letter;

public:
  int weight();
  int get_arity();
  string get_letter();

  Symbol(int arity, string letter) {}

  ~Symbol() {}
  
};

class Arity_0_Symbol : public Symbol {

public:
  Arity_0_Symbol(string letter);
  
};

class Arity_1_Symbol : public Symbol {

public:
  Arity_1_Symbol(string letter);
  
};
  
class Arity_2_Symbol : public Symbol {

public:
  Arity_2_Symbol(string letter);
  
};

class Arity_k_Symbol : public Symbol {

public:
  Arity_k_Symbol(int arity, string letter);
  
};

class Quantifier : public Arity_1_Symbol {

public:
  Quantifier(string letter);

private:
  bool letterIsValidQuantifier(string letter);
  
};

class Negation : public Arity_1_Symbol {

public:
  Negation();
  
};

class Logical_Binary_Operator : public Arity_2_Symbol {

public:
  Logical_Binary_Operator(string letter);

private:
  bool letterIsValidLogicalBinaryOperator(string letter);
  
};

class Function : public Arity_k_Symbol {

public:
  Function(int arity, string letter);
  
};

class Relation : public Arity_k_Symbol {

public:
  Relation(int arity, string letter);

};

class Constant : public Arity_0_Symbol {

public:
  Constant(int arity, string letter);
  
};

class Equality : public Logical_Binary_Operator {

public:
  Equality();
  
};

class Variable : public Arity_0_Symbol {

public:
  Variable(string letter);
  
};

#endif
