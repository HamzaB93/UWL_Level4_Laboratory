#include <stdio.h>

int powerof2(int n);

int main()
{
  printf("Program to find out if a number is power of 2\n");
  
  int number;
  int check;

  //User is asked to enter a number
  printf("Enter a number: ");
  //Number is stored in the container number
  scanf("%d", &number);

  check = powerof2(number);
  
  return 0;
}

int powerof2(int n)
{ 
  int num;
  num = n;

//If the number and the number-1 is equal to 0 it is a power of 2
  if ((num & (num - 1))== 0)
  {
    printf("%d is a power of 2\n" ,num);
  }
  //Other wise it is not a power of 2
  else
  {
    printf("%d is not a power of 2\n" ,num);
  }
}
