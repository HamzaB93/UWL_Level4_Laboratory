#include <stdio.h>

int main()
{
  printf("Program to find greatest in 3 numbers\n");
  
  int number1, number2, number3;

  //User enters three number, numbers are then stored in containers
  printf("Enter your first number: ");
  scanf("%d", &number1);
  printf("Enter your second number: ");
  scanf("%d", &number2);
  printf("Enter your third number: ");
  scanf("%d", &number3);

  //If number 1 greater than number2 and 3, print number1
  if(number1 > number2 && number1 > number3)
  {
    printf("The greatest number is %d\n", number1);
  }
  //If number 2 is greater than 1 and 3, print number2
  else if(number2 > number1 && number2 > number3)
  {
    printf("The greatest number is %d\n", number2);
  }
  //Or else 3 is the greatest, and print it
  else
  {
    printf("The greatest number is %d\n", number3);
  }
  return 0;
}
