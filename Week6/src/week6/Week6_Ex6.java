package week6;

public class Week6_Ex6 
{
    public static void main(String[] args) 
    {
    	System.out.println("Program to reverse a string\n");
		
    	// Ask for an input
    	String word = Console.askString("Enter a word or sentece: ");
		
    	// word is revered and then printed
    	String reverse = new StringBuilder(word).reverse().toString();
    	System.out.println("Your word or sentence: \n" + word + "Backwards: " + reverse);
    }
}
