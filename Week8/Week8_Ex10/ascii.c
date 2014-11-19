#include <stdio.h>

int main()
{
  printf("Program to print all ASCII value table\n");

  int i;
  
  //When i = 0 and until i is less than or equal to 255, increment i by 1
  for(i = 0; i<= 255; i++)
  {
    //Use of %c shows coresponding ascii value for that int
    printf("The ASCII val for %c is: %d\n", i , i);
  }
  return 0;
}
