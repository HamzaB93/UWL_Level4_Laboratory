// The purpose of the program is to read an integer and print
// it out. But the program seg faults. Use gdb to find the error.
//
// gcc -Wall -g -o ex1 ex1.c    

// SOLVED
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]){

  // declaring variable
  int x;

  // prompting user for user to enter data 
  printf("Please enter an integer : ");

  //Error here, expects %d to be stored. missing &x
  scanf("%d",&x);

  // printing the int stored in x
  printf("the integer entered was %d \n", x);

  return EXIT_SUCCESS;

}
