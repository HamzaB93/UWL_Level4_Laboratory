package adsJavaExercises;

public class PersonTest 
{
	/*
	 * Person class application code
	 */

	public static void main(String[] args) 
	{
		////////// Constructor //////////
		
		// Constructing people using Person class
		PersonADT hamza = new PersonADT("Hamza Bhatti", 20, 1993, "British", 1.77, 11.00);
		PersonADT john = new PersonADT("John Doe", 28, 1988, "American", 1.80, 9.00);
		PersonADT homer = new PersonADT("Homer Simpson", 30, 1970, "American", 1.90, 17);
		PersonADT peter = new PersonADT("Peter Griffin", 30, 1970, "American", 1.90, 20);
		
		////////// Accessor //////////
		
		// Using the compareTo method homer and peter
		System.out.println("Comparing Homer's age with Peter's: ");
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
		System.out.println("Hamza's original weight:");
		System.out.println(hamza.toString() + "\n");
		// Changing weight
		System.out.println("Hamza's new weight");
		hamza.changeWeight(10);
		// Details with new weight
		System.out.println(hamza.toString() + "\n");
			
	}
}
