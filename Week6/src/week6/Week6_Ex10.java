package week6;

public class Week6_Ex10 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to print all ASCII value table\n");
		{
			char begin = 'A';
			char end = 'Z';
			char i = ' ';

			// Prompt and read
			for (i=begin; i<=end; i++)
			{
				int asciiValue = (int)i; 

				System.out.println(i + "(" + asciiValue + ")");
			}
		} 
	}
}
