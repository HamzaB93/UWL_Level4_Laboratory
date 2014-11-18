
#include<stdio.h>
#include<string.h>

int main()
{
  char*str word[100];
  printf("Enter a string: ");
  scanf("%s",&word);

  strrev(word);

  printf("Reverse of the entered word is %s",word);
  
  return 0;
}
