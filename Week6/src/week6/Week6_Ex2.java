package week6;

public class Week6_Ex2 
{
	public static void main(String[] args) 
    {
	
	    int number = Console.askInt("Enter a number: ");
	    
	    String message;
	    // Determine whether it is prime or not.
	    if (isPrime(number)) 
	    {
	        message = "is a prime number.";
	    } 
	    else 
	    {
	        message = " is not a prime number.";
	    }
	    
	    System.out.println("The number " + number + message);
	}
	public static boolean isPrime(int number) {
		return isPrime(number);
	}
}

