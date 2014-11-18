#include <stdio.h>

int main()
{
  printf("Program to check if a number is a palindrome\n");

  //Declaring variables
  int number,  reverse, numberv2 ;
  
  //Asking user to input a number
  printf("Enter a number: ");
  //Number is stored in container number
  scanf("%d", &number);

  numberv2 = number;
  reverse = 0;

  //Reversing the number inside a while loop
  while (numberv2 != 0)
  { // When reverse = 0 use base of 10
    reverse = reverse * 10;
    //Using %10 to obtain length of number and reverse it
    reverse = reverse + numberv2%10; 
    numberv2 = numberv2/10;
  }
  
  //If the number is equal to the reverse
  if (number == reverse)
  { //It is a palindrome
    printf("The number %d is a palindrome\n", number);
  }  
  //Otherwise if number and reverse are not equal
  else if (number != reverse)
  { //The number is not a palindrom
    printf("The number %d is not a palindrome\n", number);
  }

  return 0;
}
