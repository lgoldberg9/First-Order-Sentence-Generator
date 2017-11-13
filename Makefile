make_main: main.c constructs.h
	gcc -Wall -ansi -std=c11 -fmem-report main.c -o main;

clean:
	rm main;
