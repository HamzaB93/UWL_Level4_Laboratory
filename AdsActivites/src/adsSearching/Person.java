package adsSearching;

public class Person 
{
	/*
	 *  Class declaration
	 */
	
	// Data representation should be private
	private int age, yearOfBirth;
	private String fullName, nationality;
	private double height;
	private double weight;
	
	////////// Constructor //////////
	
	public Person (String fullName, int age, int yearOfBirth, 
			String nationality, double height,
			double weight)
	{	// Construct a person that has an age, year of birth,
		// full name, nationality, height(meters) and weight(stone)
		this.fullName = fullName;
		this.age = age; 
		this.yearOfBirth = yearOfBirth;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}

	////////// Accessor //////////
	
	public int compareTo (Person that)
	{
		// When comparing, return 1 if this person is older than,
		// that person, return -1 if this person is younger than,
		// that person, and 0 when they are equal
		
		//if (this.age > that.age)
		//	return 1;
		//if (this.age < that.age)
		//	return -1;
		//else
		//	return 0;
		return (this.age > that.age ? +1 :
				this.age < that.age ? -1 :
				this.age > that.age ? +1 : 0);
	}

	public String toString ()
	{
		// Give the details/ attributes of the person in
		// String format
		return("Full Name: " + this.fullName + ", " + "Age: " + this.age 
				+ ", " +" Year of Birth: " + this.yearOfBirth + ", " 
				+ "Nationality: " + this.nationality + ", " +
				"Height(meters): " + this.height +", "+ "Weight(stone): " + this.weight);
	}

	
	////////// Transformer //////////
	
	public void changeWeight (int n)
	{
		// change the weight of the person
		this.weight = n;
	}
	
}
