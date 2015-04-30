// The purpose of the program is to allocate an array of ints
// and initialize them to a random number. But the program seg
// faults. Use gdb to find the error.
//
// gcc -Wall -g -o ex2 ex2.c

//SOLVED
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main(int argc, char* argv[]){

  // this is printing the max value that ubuntu can print
  printf("%d \n", INT_MAX);

  // error here, if n is the max value
  int n = 5;
  // an array cannot show the maximum value, n should change
  int A[n];
  int i = 0;
  while (i<10)
    {    
      A[i] = 12;
      printf("%d\n", A[i]);  
      i++; 
    }
  return EXIT_SUCCESS;
}
