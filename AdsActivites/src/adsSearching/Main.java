package adsSearching;

public class Main 
{
	/*
	 * Person class application code
	 */

	public static void main(String[] args) 
	{
		////////// Constructor //////////
		
		// Constructing people using Person class
		Person hamza = new Person("Hamza Bhatti", 21, 1993, "British", 1.77, 11.00);
		Person john = new Person("John Doe", 28, 1988, "American", 1.80, 9.00);
		Person homer = new Person("Homer Simpson", 30, 1970, "American", 1.90, 17);
		Person peter = new Person("Peter Griffin", 30, 1970, "American", 1.90, 20);
		
		////////// Accessor //////////
		
		// Using the compareTo method
		if(homer.compareTo (peter) > 0 )
			System.out.println("Homer is older than Peter\n");
		else if (homer.compareTo (peter) <  0 )
			System.out.println("Homer is younger than Peter\n");
		else 
			System.out.println("They are the same age\n");
		
		// Using toString method to print details out in string format
		System.out.println("Printing people:");
		System.out.println(hamza.toString() + "\n" );
		System.out.println(john.toString() + "\n" );
		System.out.println(homer.toString() + "\n" );
		System.out.println(peter.toString() + "\n" );
		
		////////// Transformer //////////
		
		// Using the changeWeight method
		// Original details
		System.out.println(hamza.toString() + "\n");
		// Changing weight
		hamza.changeWeight(10);
		// Details with new weight
		System.out.println(hamza.toString() + "\n");
		
		
		
	}
}
