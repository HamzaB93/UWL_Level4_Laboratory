`#include <stdio.h>

int main()
{
  printf("Program to find out if a number is prime\n");

  int number , i;
  int indicator = 0;
  
  //User enters a number. The number is stored in the container number
  printf("Enter a number: ");
  scanf("%d" ,&number);

  //The for loop checks if number PERFECTLY is divisible by 2 onwards,
  // if it is not perfectly divisible until i<=number/2, the number
  // is prime
  for(i=2; i<=number/2 ; ++i)
    {
      if(number%i == 0)
	{ //If number is divisible by 2 the indicator will be 1 
	  indicator = 1;
	  break;
	}
    }
  //If the indicator is 0 (not 1) the number entered is prime
  if(indicator == 0)
    {
      printf("%d is a a prime number\n" ,number);
    }
  //Otherwise the indicator was 1 and the number is not a prime number
  else
    {
      printf("%d is not a prime number\n" ,number);
    }
  return 0;
}


