#include <stdio.h>

int main()
{
  printf("Program to calculate factorial of an integer number\n");

  int number, i , fact = 1;
  
  //User inputs a number they want the factorial for
  printf("Enter a number: ");
  //number stored in container "number"
  scanf("%d", &number);

  //When i is 1, until i is less than or equal to number, increment by 1
  for (i = 1 ; i<= number; i++)
  { //fact will equal 1*1 (i=1) and will increment   
    fact = fact*i;
  }

  //Result printed out
  printf("The factorial of %d is: %d\n" , number , fact);

  return 0;
}
