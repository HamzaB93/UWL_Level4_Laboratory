package week7;

//importing an array list function
import java.util.ArrayList;

public class Students 
{
	// Using an array to store info
	ArrayList<Student>Students; 
	// Store all items from student into Students class array
	
	public Students()
	{
		Students = new ArrayList<Student>();
		//a container to hold contents from the Student class
	}
		
	// creating a method to check how many students have been enrolled
	public int getSize()
	{
		return Students.size();
	}
	//creating a method to add new item, or students to the array list
	public void add(Student aStudent)
	{
		Students.add(aStudent);
	}
	
	public void print(String header)
	{
		System.out.println(header);
		for (int i = 0; i < Students.size(); i++)
		System.out.println( Students.get(i)); // prints the numbers of entries in the array list 
	}
}
