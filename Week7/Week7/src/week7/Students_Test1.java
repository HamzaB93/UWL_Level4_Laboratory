package week7;

public class Students_Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("Testing my array list\n");
		
		Students Students = new Students();
		
		Student Student1 = new Student(); //create objects
		Student1.ask("Enter details");
		Students.add(Student1);
		
		Student Student2 = new Student();
		Student2.ask("Enter details");
		Students.add(Student2);
		
		Students.print("Entries to the array: \n");
		System.out.println(Students.getSize());
	}

}