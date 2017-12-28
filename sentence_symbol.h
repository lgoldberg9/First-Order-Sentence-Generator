#ifndef __SENTENCE_SYMBOL_H__
#define __SENTENCE_SYMBOL_H__
#include <cwchar>

const wchar_t UNIVERSAL_QUANT = '\u2200';
const wchar_t EXISTENTIAL_QUANT = '\u2203';
const wchar_t IMPLICATION = '\u21D2';
const wchar_t NOT = '\u00AC';
const wchar_t AND = '\u2227';
const wchar_t OR = '\u2228';

using namespace std;

class Symbol {
protected:
  int arity;
  wchar_t letter;

public:
  int weight();
  int get_arity();
  wchar_t get_letter();

  Symbol(int arity, wchar_t letter) {}

  ~Symbol() {}
  
};

class Arity_0_Symbol : public Symbol {

public:
  Arity_0_Symbol(wchar_t letter);
  
};

class Arity_1_Symbol : public Symbol {

public:
  Arity_1_Symbol(wchar_t letter);
  
};
  
class Arity_2_Symbol : public Symbol {

public:
  Arity_2_Symbol(wchar_t letter);
  
};

class Arity_k_Symbol : public Symbol {

public:
  Arity_k_Symbol(int arity, wchar_t letter);
  
};

class Quantifier : public Arity_1_Symbol {

public:
  Quantifier(wchar_t letter);

private:
  bool letterIsValidQuantifier(wchar_t letter);
  
};

class Negation : public Arity_1_Symbol {

public:
  Negation();
  
};

class Logical_Binary_Operator : public Arity_2_Symbol {

public:
  Logical_Binary_Operator(wchar_t letter);

private:
  bool letterIsValidLogicalBinaryOperator(wchar_t letter);
  
};

class Function : public Arity_k_Symbol {

public:
  Function(int arity, wchar_t letter);
  
};

class Relation : public Arity_k_Symbol {

public:
  Relation(int arity, wchar_t letter);

};

class Constant : public Arity_0_Symbol {

public:
  Constant(int arity, wchar_t letter);
  
};

class Equality : public Logical_Binary_Operator {

public:
  Equality();
  
};

class Variable : public Arity_0_Symbol {

public:
  Variable(wchar_t letter);
  
};

#endif
