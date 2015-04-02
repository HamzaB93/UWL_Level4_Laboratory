package adsJavaExercises;

//importing linked list as it contains the methods needed to create and manipulate a stack
import java.util.LinkedList;

public class Bracketing 
{	/*
	 * Program implement the bracket algorithm
	 */
	public static void main(String[] args) 
	{
		String mathExpression1;
		String mathExpression2;
		
		// String maths term well bracketed
		mathExpression1 = "s X (s - a) X (s - b) X (s - c)";
		
		// String maths term ill bracketed
		mathExpression2 = "s X (s - a) X (s - b X (s - c)"; 
		
		// Calling wellBracketed method for checking
		// expression 1 should be true, 2 false
		boolean bracketMethod1 = wellBracketed(mathExpression1); 
		boolean bracketMethod2 = wellBracketed(mathExpression2);
		
		// Printing expressions
		System.out.println("Checking to see if expressions are"
				+ " well brackedted:\n");
		
		// Printing expression 1 boolean
		System.out.println("Expression: " + mathExpression1 +"\n" +
				"Well Bracketed: " + bracketMethod1 +"\n");
		
		// Printing expression 2 boolean
		System.out.println("Expression: " + mathExpression2 +"\n" +
				"Well Bracketed: " + bracketMethod2 +"\n");
	}
	
	// Creating the wellBracketed method
	public static boolean wellBracketed (String phrase)
	{
		// This method tests to see if the string
		// is well bracketed
		
		// Creating a new stack/ linked list
		LinkedList bracketStack = new LinkedList();
		
		// for loop starting from left to right of the string
		for (int i = 0; i < phrase.length(); i++)
		{
			// going through each character
			char sym = phrase.charAt(i);
			
			// store the bracket
			if (sym == '(' || sym == '[' || sym == '{')
				bracketStack.addLast(sym);
			else if (sym == ')' || sym == ']' || sym == '}')
			{
				if (bracketStack.isEmpty()) return false;
				char left = (char) bracketStack.removeLast();
				// checking if they both match with another method
				// if they dont return false
				if (! matched(left, sym)) return false;
			}
		}
	return (bracketStack.isEmpty());	
	}
	
	// Method setting the conditions for each case
	public static boolean matched (char left, char right)
	{
		// return true if and only if left and right are matching
		switch (left)
		{
			// 
			case '(': return (right == ')');
			case '[': return (right == ']');
			case '{': return (right == '}');
			default: return false;
		}
	}
}
