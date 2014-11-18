package week6;

public class Week6_Ex2 
{
	public static void main(String[] args) 
    {
		System.out.println("Program to find out if a number is prime\n");
		
		//User is asked for a number
	    int number = Console.askInt("Enter a number: ");
	    
	    //Declaring a string called message to used later
	    String message;
	    
	    //If statement which uses a function called isPrime and uses our variable number as parameter
	    if (isPrime(number)) 
	    {	//If the function returned a true value, number was in fact a prime
	        message = " is a prime number.";
	    } 
	    //Otherwise, if the function gave a false value
	    else 
	    {	//The number variable was not a prime number
	        message = " is not a prime number.";
	    }
	    
	    System.out.println("The number " + number +" "+ message);
	}
	
	//Function called isPrime which accepts an int value (in this case the variable number)
	public static boolean isPrime(int n) 
	{
		//If n / number is greater or equal to 1
		if (n <= 1) 
	    {	//return false as 1 is not a prime
			return false;
	    }
		//When the new variable i = 2, but i is greater than the method Math.sqrt which takes our number
		// add 1 to i
	    for (int i = 2; i < Math.sqrt(n); i++) 
	    {	//If n/number is divisible by i = 2 (at the start) and gives 0
	    	if (n % i == 0) 
	    	{	//It is not prime
	    		return false;
	        }
	    }
	     //Otherwise it is a prime		
	     return true;       
	     // Exit the function and return to the top
	 }
}	 

