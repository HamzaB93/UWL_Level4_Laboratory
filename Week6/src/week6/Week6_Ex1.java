package week6;

public class Week6_Ex1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to check if a number is even or odd\n");
		
		//User is asked to enter a number
		int a = Console.askInt("Please input a number: ");
		
		//If number is not divisible by 2 it is odd
		if (a %2 != 0)
		{
			System.out.println("This is an odd number");
		}
		//Otherwise the number is an even number
		else
		{
			System.out.println("This is an even number.");
		}
	}
}