#include <string>

using namespace std;

int symbol::weight() {
  return 1 - this->artiy;
};

int symbol::get_arity() {
  return this->arity;
}
  
string symbol::get_letter() {
  return this->letter;
}

Symbol::Symbol(int arity, string letter) {
  this->arity = arity;
  this->letter = letter;
}

Arity_0_Symbol::Arity_0_Symbol(string letter) {
  int arity = 0;
  Symbol(arity, letter);
}

Arity_1_Symbol::Arity_1_Symbol(string letter) {
  int arity = 1;
  Symbol(arity, letter);
}

Arity_2_Symbol::Arity_2_Symbol(string letter) {
  int arity = 2;
  Symbol(arity, letter);
}

Arity_k_Symbol::Arity_k_Symbol(int arity, string letter) {
  Symbol(arity, letter);
}

Quantifier::Quantifier(string letter) {
  if (this->letterIsValidQuantifier(letter)) {
    Arity_1_Symbol(letter);
  }
}

bool letterIsValidQuantifier(string letter) {
  return letter == UNIVERSAL_QUANTIFIER || letter == EXISTENTIAL_QUANTIFIER;
}

int Quantifier::weight() {
  return -1;
}

Negation::Negation() {
   string letter = NOT;
   Arity_1_Symbol(letter);
}

Logical_Binary_Operator(string letter) {
  if (letterIsValidOperator(letter)) {
    Arity_2_Symbol(letter);
  }
}
  
bool Logical_Binary_Operator::letterIsValidLogicalBinaryOperator(string letter) {
  return letter == IMPLICATION || letter == AND || letter == OR;
}

Function::Function(int arity, string letter) {
  Arity_k_Symbol(arity, letter);
}

Relation::Relation(int arity, string letter) {
  Arity_k_Symbol(arity, letter);
}

Constant::Constant(int arity, string letter) {
  Arity_0_Symbol(arity, letter);
}

Equality::Equality() {
  string letter = '=';
  Logical_Binary_Operator(letter);
}

Variable::Variable(string letter) {
  Arity_0_Symbol(letter);
}
