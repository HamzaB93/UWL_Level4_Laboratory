package week6;

import java.util.Arrays;
public class Week6_Ex5 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to sort an integer array without using API methods\n");
		
		//An array is created with these numbers
		int array[] = {5, 3, 2, 4, 1, 2, 5, 3};
		
		//For all the numbers in the array
		for (int number : array)
		{	//Print out the number
			System.out.println("Number: " + number);
		}
		System.out.println("\n"); //New line
		
		//Using the sort method for all the numbers in the array
		Arrays.sort(array);
		System.out.println("In ascending order: \n");
		//For all the numbers in the array
		for (int number : array)
		{	//Print them out, but now in ascending order
			System.out.println("Number: " + number);
		}
		
	}
}
