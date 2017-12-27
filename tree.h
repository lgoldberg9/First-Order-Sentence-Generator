#include <stdio.h>
#include <stdlib.h>

struct letter_node_s {
  symbol letter;
  letter_node *letter_children; //depends on arity of letter
};

typedef struct polish_tree_s {
  letter_node *root;
  int size;
} polish_tree;

polish_tree create_sentence(void) {


}

letter_node create_letter(void) {
  
}
