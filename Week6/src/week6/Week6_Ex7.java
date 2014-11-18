package week6;

public class Week6_Ex7 
{
	public static void main(String args[])
	{
		System.out.println("Program to print Fibonacci series up to a given number");
		
		//Asking the user to input they want the Fibonacci to end at
		int num = Console.askInt("Enter a number: "); 
		//Declaring varaibles
		int f1; 
		int f2 = 0; 
		int f3 = 1;
	
		//When i = 1 and until i is greater or equal to the number it will end at, add 1
		//i acts as a count
		for(int i=1;i<=num;i++)
		{
			System.out.print(" "+f3+" ");
			f1 = f2; //f1 will start as 0
			f2 = f3; //f2 is now the same as f3
			f3 = f1 + f2; //f3 = 0 + 1 
			//Continue until last number matches the input
		}
	}
}
