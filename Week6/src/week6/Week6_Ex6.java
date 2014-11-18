package week6;

public class Week6_Ex6 
{
    public static void main(String[] args) 
    {
    	System.out.println("Program to reverse and string without using String buffer\n");
		
    	//Ask for a string input
    	String word = Console.askString("Enter a word or sentece: ");
		
    	//Word is revered and then printed (same method used previously in Week6_Ex3)
    	String reverse = new StringBuilder(word).reverse().toString();
    	System.out.println("Your word or sentence: \n" + word + "Backwards: " + reverse);
    }
}
