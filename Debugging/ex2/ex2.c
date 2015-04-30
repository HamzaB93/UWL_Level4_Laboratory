// The purpose of the program is to read a set of strings from a 
// file. But the program seg faults. Use gdb to find the error.
//
// gcc -Wall -g -o ex2 ex2.c

//SOLVED
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]){

  // ERROR here, trying to open file and read it. 
  FILE* fp = fopen("text.txt", "r");
  // missing a value of array
  char* word[100]

  //wants to print the string text from the file
  while (fscanf(fp,"%s",word)>0)
    {
      printf("%s",word);
    }
  return 0;

}
