package week6;

public class Week6_Ex4 
{
    public static void main(String[] args) 
    {
    	System.out.println("Program to find if a number is power of 2\n");
		
    	//user inputs a number
    	int number = Console.askInt("Enter a number: ");
	
    	//checking if the number is a power of 2
    	if ((number & (number - 1 )) == 0)
    	{
    		System.out.println(number + " is a power of 2");
    	}
    	else
    	{
    		System.out.println(number + " is not a power of 2");
    	}
    }
}
