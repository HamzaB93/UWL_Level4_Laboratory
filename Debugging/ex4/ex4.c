// This code may throw a segmentation fault. Use debugger to
// find out where the errors are and fix them.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char* argv[]){

  // Error here
  char* name = malloc(strlen(argv[1]));

  // name is .....
  name = strcpy(name, argv[1]);

  //printing the name
  printf("%s \n", name);

  return EXIT_SUCCESS;
}
