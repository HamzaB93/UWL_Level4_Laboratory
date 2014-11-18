package week6;

public class Week6_Ex10 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to print all ASCII value table\n");
		{
			//The first character
			char begin = 'A';
			//The last character
			char end = 'Z';
			//Empty character
			char i = ' ';

			//When the i = the beginning (A), but when until i is greater or equal to end (Z)
			// Add 1 to i
			for (i=begin; i<=end; i++)
			{	//Declaring asciivalue as an integer that converts i(which was a character) into and int val
				int asciiValue = (int)i; 
				
				//And print out the value and loop back
				System.out.println(i + "(" + asciiValue + ")");
			}
		} 
	}
}
