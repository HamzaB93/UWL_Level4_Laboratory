package week6;

public class Week6_Ex1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to check whether a number is off or even\n");
		
		// check for odd numbers
		int a = Console.askInt("Please input a number: ");
		
		// if number is not divisible by 2 it is odd
		if (a %2 != 0)
		{
			System.out.println("This is an odd number");
		}
		else
		{
			System.out.println("This is an even number.");
		}
	}
}