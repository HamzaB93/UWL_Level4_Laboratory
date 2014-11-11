package week6;

public class Week6_Ex8 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to calculate the factorial of a number");
		
		int number = Console.askInt("Enter a number: ");
		
		int fact = 1;
		
		for (int c = 1 ; c <= number; c++)
		{
			fact = fact*c;
		}
		System.out.println("The factorial of " + number + " is: " + fact);
	}
}
