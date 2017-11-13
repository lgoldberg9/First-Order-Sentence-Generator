#ifndef __CONSTRUCTS_H__
#define __CONSTRUCTS_H__

// Uncomment after unicode conflict resolved
//#define universal_quant 8704;
//#define existential_quant 8707;

#define universal_quant "uA";
#define existential_quant "uE";
#define equality "=";
#define implication "->";
#define and "/\\";
#define or "\\/";

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
