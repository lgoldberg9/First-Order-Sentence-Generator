#include <streamio>
#include <cstdlib>
#include <cwchar>
#include <string>
#include <list>

const wchar_t UNIVERSAL_QUANT = U+2200;
const wchar_t EXISTENTIAL_QUANT = U+2203;
const wchar_t IMPLICATION = U+21D2;
const wchar_t NOT = U+00AC;
const wchar_t AND = U+2227;
const wchar_t OR = U+2228;

using namespace std;

class symbol {
protected:
  virtual int arity;
  virtual wchar_t letter;

public:
  int weight() {
    return 1 - this.artiy;
  };

  int get_arity() {
    return this.arity;
  }
  
  wchar_t get_letter() {
    return this.letter;
  }

  symbol(int arity, wchar_t letter) {
    this.arity = arity;
    this.letter = letter;
  }

  ~symbol() {}
  
};

class arity_0_symbol : public symbol {

  arity_0_symbol(wchar_t letter) {
    int arity = 0;
    symbol(arity, letter);
  }
  
};

class arity_1_symbol : public symbol {

  arity_1_symbol(wchar_t letter) {
    int arity = 1;
    symbol(arity, letter);
  }
  
};
  
class arity_2_symbol : public symbol {

  arity_2_symbol(wchar_t letter) {
    int arity = 2;
    symbol(arity, letter);
  }
  
};

class arity_k_symbol : public symbol {

  arity_k_symbol(int arity, wchar_t letter) {
    symbol(arity, letter);
  }
  
};

class quantifier : public arity_1_symbol {

  quantifier(wchar_t letter) {
    if (letterIsValidQuantifier(letter)) {
      arity_1_symbol(letter);
    }
  }

  int weight() {
    return -1;
  }

private:
  boolean letterIsValidQuantifier(wchar_t letter) {
    return letter == UNIVERSAL_QUANTIFIER || letter == EXISTENTIAL_QUANTIFIER;
  }
  
};

class negation : public arity_1_symbol {

  negation() {
    wchar_t letter = NOT;
    arity_1_symbol(letter);
  }
  
};

class logical_binary_operator : public arity_2_symbol {

  logical_binary_operator(wchar_t letter) {
    if (letterIsValidOperator(letter)) {
      arity_2_symbol(arity, letter);
    }
  }

private:
  
  boolean letterIsValidLogicalBinaryOperator(wchar_t letter) {
    return letter == IMPLICATION || letter == AND || letter == OR;
  }
  
}

class function : public arity_k_symbol {

  function(int arity, wchar_t letter) {
    arity_k_symbol(arity, letter);
  }
  
};

class relation : public arity_k_symbol {

  relation(int arity, wchar_t letter) {
    arity_k_symbol(arity, letter);
  }

};

class constant : public arity_0_symbol {

  constant(int arity, wchar_t letter) {
    arity_0_symbol(arity, letter);
  }
  
};

class equality : public binary_operator {

  equality() {
    wchar_t letter = '=';
    binary_operator(letter);
  }
  
};

class variable : public arity_0_symbol {

  variable(wchar_t letter) {
    arity_0_symbol(letter);
  }
  
};

