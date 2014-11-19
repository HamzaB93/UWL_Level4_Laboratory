#include <stdio.h>

int main()
{
  printf("Program to print Fibonacci series up to a given number\n");

  int number , i , f1 , f2 , f3;

  //User asked for the amount of number he wants the fibonacci to end at
  //Input stored in container number
  printf("Enter a number you want the Fibonacci to end at: ");
  scanf("%d", &number);

  f2 = 0;
  f3 = 1;

  //When i = 1 until i less than or equal to number, increment by 1
  for (i = 1 ; i<= number ; ++i)
    {
      //Start by print f3 = 1
      printf("  %d  " ,f3);
      //Starting: f1 = f2 meaning f1 = 0
      f1 = f2;
      //f2 will then  equal 1 as f3 = 1 
      f2 = f3;
      // f3 (number to be outputted) will be to start off as 1 + 0 = 1
      f3 = f1 + f2;
      //Loop will increment up till i = number
    }
  printf("\n");
  return 0;
}
