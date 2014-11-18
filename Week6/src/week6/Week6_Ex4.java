package week6;

public class Week6_Ex4 
{
    public static void main(String[] args) 
    {
    	System.out.println("Program to find out if a number is power of 2\n");
		
    	//User inputs a number
    	int number = Console.askInt("Enter a number: ");
	
    	//Checking if the number is a power of 2
    	//If the number variable and the number -1 eqaual to 0, then number is a power of 2
    	if ((number & (number - 1 )) == 0)
    	{
    		System.out.println(number + " is a power of 2");
    	}
    	//Or else it is not a power of 2
    	else
    	{
    		System.out.println(number + " is not a power of 2");
    	}
    }
}
