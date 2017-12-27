PROGRAMNAME := logic_parser

CC := gcc

CFLAGS := -ansi -Wall -std=c11

DEBUGFLAGS := -g -fmem-report

LDFLAGS := -lm

all: logic_creator

logic_creator: main.c constructs.h
	$(CC) $(CFLAGS) -o logic_creator main.c

clean:
	rm -f *.o *~ core*

clean-exe:
	rm -f logic_creator
