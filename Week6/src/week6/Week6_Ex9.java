package week6;

public class Week6_Ex9 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to find greatest in 3 numbers\n");
		
		//User enters 3 values
		int num1 = Console.askInt("Enter first number: ");
		int num2 = Console.askInt("Enter second number: ");
		int num3 = Console.askInt("Enter third number: ");
		
		//If statements to check which is the greatest out of the three
		//If num1 is greater then num2 and greater than num2 and num3 
		if (num1 > num2 && num1 > num3)
		{	//Print out num1
			System.out.println("The greatest number is " + num1);
		}
		//Else if num2 is greater than num1 and num2
		else if (num2 > num1 && num2 > num3)
		{	//Print out num2
			System.out.println("The greatest number is " + num2);
		}
		//Otherwise num3 is the greatest out of the three numbers
		else
		{
			System.out.println("The greatest number is " + num3);
		}
	}
}
