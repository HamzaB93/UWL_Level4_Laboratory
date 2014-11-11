package week7;

public class Week7_Ex1 
{
	public static void main(String[] args) 
	{
		System.out.println("We will calculate the are of a circle.");
		int radius = Console.askInt("Enter a radius: ");
		double Pi = 3.14;
		
		double area = radius * radius * Pi;
		
		System.out.println("Your area is: " +area );
	}
}
