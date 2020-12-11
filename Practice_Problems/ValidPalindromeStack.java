package job_coding;

import java.util.*;

public class ValidPalindromeStack 
{

	public static void main(String[] args) 
	{
		
		Stack<Character> myStack = new Stack<Character>();
		
		String userString = "Don't Nod";
		
		userString = userString.toLowerCase();
		
		userString = userString.replaceAll("[^a-zA-Z0-9]", "");
		
		char[] myArray = userString.toCharArray();
		
		
		for(int i =0; i < myArray.length; i++)
		{
			myStack.push(myArray[i]);
			//System.out.println(myArray[i]);
		}
		
		
		String abc = "";
		while(!myStack.isEmpty())
		{
			abc = abc+myStack.pop();
		}
		
		//System.out.println(abc);
		//System.out.println(userString);
		
		if(userString.equals(abc))
		{
			System.out.println("This string is palindrome");
		}
		
		else
		{
			System.out.println("This string is NOT palindrome");
		}
	}
	
	
}
