#include <stdio.h>

int main()
{
  printf("Program to check if a number is even or odd\n");
  int number;

  //User is asked to enter a number
  printf("Please enter a number: ");
  //Number is stored in the container number
  scanf("%d", &number);
  
  //If the number when divisible by 2 does not give a 0, it is odd
  if (number %2 !=0)
  {
    printf("This is an odd number");
  }
  //Otherwise the number is even
  else
  {
    printf("This is an even number\n");
  }
  return 0;
}
