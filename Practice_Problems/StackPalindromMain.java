package kirtanCodes;

import java.util.*;


public class StackPalindromMain 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("ENter the String");
		String userString = userInput.nextLine();
		
		/*
		 * Now, we will actually write down the code to check, whether the input 
		 * string is Palindrom or not.
		 */
		
		StackPalindrom newObj = new StackPalindrom();
		
		newObj.checkPalindrom(userString);
		
	}

}
