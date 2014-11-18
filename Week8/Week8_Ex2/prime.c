#include <stdio.h>

static boolean isPrime(int n);

int main()
{
  printf("Program to find out if a number is prime\n");

  int number;
  int check;

  printf("Enter a number: ");
  scanf("%d", &number);

  check = isPrime(number);

  return 0;
}


