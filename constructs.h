#ifndef __CONSTRUCTS_H__
#define __CONSTRUCTS_H__

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
