package week6;

public class Week6_Ex7 
{
	public static void main(String args[])
	{
		System.out.println("Program to print Fibonacci series up to a given number");
		int num = Console.askInt("Enter a number: "); 
		int f1; 
		int f2 = 0; 
		int f3 = 1;
	
		for(int i=1;i<=num;i++)
		{
			System.out.print(" "+f3+" ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}
}
