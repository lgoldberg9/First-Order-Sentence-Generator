logic-parser: logic_parser.cpp generator_sentence_tree.h sentence_symbol.h internal_sentence_tree.h language.h sentence_symbol.h
	g++ -Wall -ansi -std=c++11 -o logic_parser logic_parser.cpp

clean:
	rm logic_parser *~ *#
