package week7;

public class Student 
{
	// Declaring variables
	String firstName;
	String secondName;
	int studentId;
	String course;
	int level;
	int startDate;
	int endDate;
	
	// Set method
	public void set(String aFirstName , String aSecondName , int aStudentId , 
			String aCourse , int aLevel , int aStartDate , int aEndDate)
	{
		firstName = aFirstName;
		secondName = aSecondName; 
		studentId = aStudentId;
		course = aCourse;
		level = aLevel;
		startDate = aStartDate;
		endDate = aEndDate;
	}
	
	// Using parameters to set data values to Student class
	public Student(String aFirstName , String aSecondName , int aStudentId , 
			String aCourse , int aLevel , int aStartDate , int aEndDate)
	{
		set (aFirstName , aSecondName , aStudentId , aCourse , aLevel , aStartDate , aEndDate);
	}
	
	// Creating default properties for the student class
	public Student()
	{
		set("Unknown" , "Unknown" , 000000, "Unknown" , 3 , 2014 , 2017 );
	}
	
	// Set individual data methods 
	public void setFirstName(String aFirstName)
	{
		firstName = aFirstName;
	}
	public void setSecondName(String aSecondName)
	{
		secondName = aSecondName;
	}
	public void setStudenId(int aStudentId)
	{
		studentId = aStudentId;
	}
	public void setCourse(String aCourse)
	{
		course = aCourse;
	}
	public void setLevel(int aLevel)
	{
		level = aLevel;
	}
	public void setStartDate(int aStartDate)
	{
		startDate = aStartDate;
	}
	public void setEndDate(int aEndDate)
	{
		endDate = aEndDate;
	}
	
	// Ask method
	public void ask (String prompt)
	{
		System.out.println("Make your own data entries\n");
		setFirstName(Console.askString("Enter a First name: "));
		setSecondName(Console.askString("Enter a Second name: "));
		setStudenId(Console.askInt("Enter the Student ID: "));
		setCourse(Console.askString("Enter the course name: "));
		setLevel(Console.askInt("Enter the course level: "));
		setStartDate(Console.askInt("Enter the start date: "));
		setEndDate(Console.askInt("Enter the end date: "));
	}
	
	public String toString()
	{
		return "First name: " + firstName + ", Second Name: " + secondName + "Student ID: " + studentId +
				", Course: " + course + ", Level : " + level + ", Start Date: " + startDate 
				+ ", End Date: " + endDate;
	}
	
	// Print method
	public void print()
	{
		System.out.println("Student enrolment: \n");
		System.out.println("First name: " + firstName); 
		System.out.println("Second Name: " + secondName);
		System.out.println("Student ID: " + studentId );
		System.out.println("Course: " + course );
		System.out.println("Level : " + level);
		System.out.println("Start Date: " + startDate);
		System.out.println("End Date: " + endDate);
	}
}
