package week6;

public class Week6_Ex3 
{
	// check if number is palindrome 
	public static void main(String[] args) 
	{
		System.out.println("Program to see if entered number is a palindrome\n");
		
		//user inputs a number
		int number = Console.askInt("Enter a number: ");
		
		//number is converted to string
		String number1 = String.valueOf(number);
		
		//reverse number1 with >> (new StringBuilder(part).reverse().toString());
		String reverse = new StringBuilder(number1).reverse().toString();
		
		//change reverse into an integer
		int reverse1 = Integer.parseInt(reverse);
		
		//Comparing original variable number to reverse1
		if (number == reverse1)
		{
			System.out.println("The number: " + number + " is a palindrome");
		}
		else
		{
			System.out.println("The number: "+ number + " is not a palindrome");
		}
	}
}
