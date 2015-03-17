package adsADT;

public class Person 
{
	/*
	 *  This class will be the contract, outlining
	 *  class declaration
	 */
	
	
	// Data representation should be private
	private ...; 
	
	////////// Constructor //////////
	
	public Person (int age, int yearOfBirth, 
			String fullName, String nationality, float height,
			float weight);
	// construct a person that has an age, year of birth,
	// full name, nationality, height(meters) and weight(stone)
	
	////////// Accessor //////////
	
	public int compareTo (Person that);
	// when comparing, return 1 if this person is older than,
	// that person, return -1 if this person is younger than,
	// that person, and 0 when they are equal
	
	public String toString ();
	// give the details/ attributes of the person in
	// String format
	
	////////// Transformer //////////
	
	public void changeWeight (int weight);
	// change the weight of the person
}
