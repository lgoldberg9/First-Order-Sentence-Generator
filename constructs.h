#ifndef __CONSTRUCTS_H__
#define __CONSTRUCTS_H__

const wchar_t UNIVERSAL_QUANT = 8704;
const wchar_t EXISTENTIAL_QUANT = 8707;
const wchar_t IMPLICATION = 8658;
const wchar_t AND = 8743;
const wchar_t OR = 8744;
const wchar_t NOT = 172;

/*****************
 *Structure Types*
 *****************/

typedef struct function_s {
  int arity;
  char symbol;
} function;

typedef struct relation_s {
  int arity;
  char symbol;
} relation;

typedef struct constant_s {
  char symbol;
} constant;

typedef struct symbol_s {
  union Symbol_u {
    function func;
    relation rela;
    constant cons;
  } symbol_u;
} symbol;

#endif
