package week6;

public class Week6_Ex3 
{
	// check if number is palindrome 
	public static void main(String[] args) 
	{
		System.out.println("Program to check if a number is a palindrome\n");
		
		//User is enters a number
		int number = Console.askInt("Enter a number: ");
		
		//Number is converted to string
		String number1 = String.valueOf(number);
		
		//Reverse number1 with >> (new StringBuilder(part).reverse().toString());
		String reverse = new StringBuilder(number1).reverse().toString();
		
		//The reversed string is now converted into an integer
		int reverse1 = Integer.parseInt(reverse);
		
		//Comparing original variable number1 to reverse1(which are both integers
		//If number1 is equal to reverse1 then it is a palindrome
		if (number == reverse1)
		{
			System.out.println("The number: " + number + " is a palindrome");
		}
		//Or else its not a palindrome
		else
		{
			System.out.println("The number: "+ number + " is not a palindrome");
		}
	}
}
