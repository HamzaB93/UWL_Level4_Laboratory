package week6;

public class Week6_Ex9 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to find greatest in 3 numbers\n");
		
		//user enters values
		int num1 = Console.askInt("Enter first number: ");
		int num2 = Console.askInt("Enter second number: ");
		int num3 = Console.askInt("Enter third number: ");
		
		//checks
		if (num1 > num2 && num1 > num3) // if num1 is greater
		{
			System.out.println("The greatest number is " + num1);
		}
		else if (num2 > num1 && num2 > num3)// if num2 is greater
		{
			System.out.println("The greatest number is " + num2);
		}
		else
		{
			System.out.println("The greatest number is " + num3); // if num3 is greater
		}
	}
}
