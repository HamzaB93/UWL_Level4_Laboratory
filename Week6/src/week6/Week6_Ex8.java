package week6;

public class Week6_Ex8 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to calculate factorial of an integer number\n");
		
		//User enters a number
		int number = Console.askInt("Enter a number: ");
		
		//Declaring a variable fact for later use
		int fact = 1;
		
		//When c = 1, until c is less than or equal to the input, add 1 to c
		for (int c = 1 ; c <= number; c++)
		{
			fact = fact*c; // 1* 1, c will increment up 1 every time it loops until c is less or = to input
		}
		System.out.println("The factorial of " + number + " is: " + fact);
	}
}
