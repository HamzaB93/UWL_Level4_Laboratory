package week6;

import java.util.Arrays;
public class Week6_Ex5 
{

	public static void main(String[] args) 
	{
		System.out.println("Program to sort an integer array without using API methods\n");
		int array[] = {5, 3, 2, 4, 1, 2, 5, 3};
		
		for (int number : array)
		{
			System.out.println("Number: " + number);
		}
		
		System.out.println("\n");
		Arrays.sort(array);
		System.out.println("In ascending order: \n");
		for (int number : array)
		{
			System.out.println("Number: " + number);
		}
		
	}
}
