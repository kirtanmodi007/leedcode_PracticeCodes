package kirtanCodes;

import java.util.*;

public class StackParenthesisMain 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String userinput = userInput.next();
		
		/*
		 * Make an object of STackParenthesis class
		 * */
		StackParenthesis obj = new StackParenthesis();
		 obj.check(userinput);
	}

}
