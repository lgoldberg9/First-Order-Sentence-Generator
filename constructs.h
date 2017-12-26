#ifndef __CONSTRUCTS_H__
#define __CONSTRUCTS_H__

// Uncomment after unicode conflict resolved
//#define universal_quant 8704;
//#define existential_quant 8707;

const wchar_t universal_quant = 8704;
const wchar_t existential_quant = 8707;
const wchar_t implication = 8658;
const wchar_t and = 8743;
const wchar_t or = 8744;
const wchar_t not = 172;

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

#endif
