#include<stdio.h>
#include<string.h>

int main()
{
  printf("Program to reverse and string without using String buffer\n");

  char string[100], temp;
  int i, j = 0;

  //User enters a string of words and is stored in the array
  printf("Enter a word or sentence: ");
  gets(string);

  //strlen identifies the length of the string -1
  // eg. if word is Hello (there are 5 chars, but the count needs
  // to start at 0, so 1 is taken away
  i = 0;
  j = strlen(string) - 1;

  while(i < j) 
    { // i is the begining char and j is the last char
      //Cycling through chars from the begining to end
      temp = string[i];
      string[i] = string[j];
      string[j] = temp;
      i++; //Counting forwards 
      j--; //Counting backwards
    }//Loop ends when i and j meet

  //Printing out the reverse
  printf("The word or setence you entered in reverse is: %s\n", string);
  return 0;
}
