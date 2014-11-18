#include <stdio.h>

int odd_or_even(int n);

int main()
{

  printf("Program to check if a number is even or odd\n");

  int number;
  int check;

  printf("Enter a number: ");
  scanf("%d", &number);
  printf("You entered: %d\n", number);
  
  check = odd_or_even(number);
  
  return 0;
}

int odd_or_even(int n)
{
  int check;
  check = n;
  
  if (check %2 !=0)
    {
      printf("This is an odd number\n");
    }
  else
    {
      printf("This is an even number\n");
    }
}
