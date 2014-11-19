#include <stdio.h>
 
int main()
{
  printf("Program to sort an integer array without using API methods\n");
    int i, j, a, n, number[30];
    
    //User asked how many values they want to enter
    printf("Enter the value of N \n");
    //Input stored in container n
    scanf("%d", &n);

    //Another prompt, user enters values up till the value they stated earlier
    printf("Enter the numbers \n");
    //When i = 0 and when i is less than n, increment by 1
    for (i = 0; i < n; ++i)
    {  
      //numbers get stored in the array number
      //if user wants 3 number, count will start from 0 - 1 - 2
        scanf("%d", &number[i]);
    }
    
    //When i = 0 up to it being less than n(does not exceed n) increment by 1
    for (i = 0; i < n; ++i)
    {
        for (j = i + 1; j < n; ++j)
        {
            if (number[i] > number[j])
            {
                a =  number[i];
                number[i] = number[j];
                number[j] = a;
            }
        }
    }
    //Prints out all the numbers that had been arranged in the last for loop
    printf("The numbers arranged in ascending order are given below \n");
    for (i = 0; i < n; ++i)
        printf("%d\n", number[i]);
}
