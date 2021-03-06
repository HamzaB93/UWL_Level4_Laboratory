package adsJavaExercises;

public class Searching 
{
	/*
	 * Using the Person ADT to put objects into an array and search it.
	 */
	
	public static void main(String[] args) 
	{
		// Variable for searching algorthim
		int left = 0;
		int right = 3;
		
		// Constructed an array which holds a max of 4 values
		PersonADT [] people = new PersonADT [4];
		
		
		// Populating array in certain indexes with objects using Person class
		people [0] = new PersonADT("Hamza Bhatti", 21, 1993, "British", 1.77, 11.00);
		people [1] = new PersonADT("John Doe", 28, 1988, "American", 1.80, 9.00);
		people [2] = new PersonADT("Homer Simpson", 30, 1970, "American", 1.90, 17);
		people [3] = new PersonADT("Peter Griffin", 30, 1970, "American", 1.90, 20);
		
		// Printing all the objects found in the array
		System.out.println("Printing all the objects in the array\n");
		for (int i = 0; i < people.length; i++)
			System.out.println(people[i]);

		System.out.println("");
		
		// Calling linear search algorithm
		System.out.println("Searching for Peter in index 3: ");
		int myMethod = linearSearch(people[3], people, left, right);
		
		// Printing return value from the linearSearch method
		
		if (myMethod != 0)
			System.out.println("Searched array is: " + people[myMethod]);
		else
			System.out.println("No such target");
				
	}
	
	// Linear Search algorithm
	static int linearSearch(Object target, Object[] a, int left,
			int right)
	{
		// Method to find an element in the array that matches the target
		
		// p will be the left most element of the array and will increment till it reaches the right
		for (int p = left; p <= right; p ++)
		{
			// Using java method .equals to find the target element in the array and return it
			if (target.equals(a[p]))
				return p;
		}
		// Otherwise return -1 if it can't be found
		return 0;
	}
}
