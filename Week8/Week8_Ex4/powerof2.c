#include <stdio.h>

int main()
{
  printf("Program to find out if a number is power of 2\n");
  
  int number;

  //User is asked to enter a number
  printf("Enter a number: ");
  //Number is stored in the container number
  scanf("%d", &number);

  //If the number and the number-1 is equal to 0 it is a power of 2
  if ((number & (number - 1))== 0)
  {
    printf("%d is a power of 2\n" ,number);
  }
  //Other wise it is not a power of 2
  else
  {
    printf("%d is not a power of 2\n" ,number);
  }
  return 0;
}
