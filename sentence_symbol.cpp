#include <cwchar>

int symbol::weight() {
  return 1 - this->artiy;
};

int symbol::get_arity() {
  return this->arity;
}
  
wchar_t symbol::get_letter() {
  return this->letter;
}

Symbol::Symbol(int arity, wchar_t letter) {
  this->arity = arity;
  this->letter = letter;
}

Arity_0_Symbol::Arity_0_Symbol(wchar_t letter) {
  int arity = 0;
  Symbol(arity, letter);
}

Arity_1_Symbol::Arity_1_Symbol(wchar_t letter) {
  int arity = 1;
  Symbol(arity, letter);
}

Arity_2_Symbol::Arity_2_Symbol(wchar_t letter) {
  int arity = 2;
  Symbol(arity, letter);
}

Arity_k_Symbol::Arity_k_Symbol(int arity, wchar_t letter) {
  Symbol(arity, letter);
}

Quantifier::Quantifier(wchar_t letter) {
  if (this->letterIsValidQuantifier(letter)) {
    Arity_1_Symbol(letter);
  }
}

bool letterIsValidQuantifier(wchar_t letter) {
  return letter == UNIVERSAL_QUANTIFIER || letter == EXISTENTIAL_QUANTIFIER;
}

int Quantifier::weight() {
  return -1;
}

Negation::Negation() {
   wchar_t letter = NOT;
   Arity_1_Symbol(letter);
}

Logical_Binary_Operator(wchar_t letter) {
  if (letterIsValidOperator(letter)) {
    Arity_2_Symbol(letter);
  }
}
  
bool Logical_Binary_Operator::letterIsValidLogicalBinaryOperator(wchar_t letter) {
  return letter == IMPLICATION || letter == AND || letter == OR;
}

Function::Function(int arity, wchar_t letter) {
  Arity_k_Symbol(arity, letter);
}

Relation::Relation(int arity, wchar_t letter) {
  Arity_k_Symbol(arity, letter);
}

Constant::Constant(int arity, wchar_t letter) {
  Arity_0_Symbol(arity, letter);
}

Equality::Equality() {
  wchar_t letter = '=';
  Logical_Binary_Operator(letter);
}

Variable::Variable(wchar_t letter) {
  Arity_0_Symbol(letter);
}
