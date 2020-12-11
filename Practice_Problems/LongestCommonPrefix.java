package kirtanCodes;

import java.lang.reflect.Array;
import java.util.Scanner;

import jdk.dynalink.linker.ConversionComparator.Comparison;

public class LongestCommonPrefix 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		//We will take userInput till the time, he doesn't press the Exit button.
		
		/*
		Since, all of the methods are in different class, You have to create object
		of that class.
		*/
		Processing obj = new Processing();
		
		
		//Now, we will make an do while loop.
		boolean exitVariable = false;
		do
		{
			//Here, we will use the switch case. 
			System.out.println("Enter 1 to add String values into Array");
			System.out.println("Enter 2 to display String values of Array");
			System.out.println("Enter 3 to display Longest Common Prefix of Array");
			System.out.println("Enter 0 to exit");
			
			int choice = userInput.nextInt();
			
			//Now, whatever input user has inserted, we can match that in switch case.
			
			switch(choice)
			{
			case 1:
				obj.insertIntoArray();
				break;
				
			case 2:
				obj.display();
				break;
				
			case 3:
				obj.longestPrefix();
				break;
			
				/*Here, in case 0 , you will change the boolean variable's value from,
				true to false. */
			case 0:
				exitVariable = true;
				break;
			}
				
			
		}
		
		while(!exitVariable);
		
		/*Creating an object to access the seperate function which lies in the same class.
		  we will find the longest prefix*/
		
		
	}
	
	
}

class Processing
{
	//First of all we need an array to store user input STRING VALUE.
	String[] userInputString = new String[10];
	int i = -1;
	int j;
	
		
	public void insertIntoArray()
	{
		Scanner userInput2 = new Scanner(System.in);
		
		System.out.println("Enter the string values");
		String inputValue = userInput2.nextLine();
		
		userInputString[i+1] = inputValue;
		i++;
	}
	
	public void display()
	{
		for(j = 0; j <= i; j++)
		{
			System.out.println(userInputString[j]);
		}
	}
	
/******************************ACTUAL CODE LOGIC**************************************/
	public void longestPrefix()
	{
		/*This function will print the longest Common prefix currently available in 
		the "userInputString" Array. */
		
		/*
		 * Now 1st condition is to check whether our array is empty or not
		 * Because if our array is empty, we can not have any prefix
		 */
		if(userInputString.length==0 || userInputString==null)
		{
			System.out.println("");
		}
		
		/*
		 * If the array is not null, that simply means we atleast have a SINGLE String.
		 * So, take your String's 1st Element as your Longest Common Prefix initially.
		 */
		
		String LongestCommonPrefix = userInputString[0];
		
		/*
		 * So, now we have to start looping through our array.
		 */
		for(int k = 1 ; k<userInputString.length; k++)
		{
			/*
			Whatever is at index 1, firstly take that in seperate variable
			for future Comparison.
			*/
			String currentString = userInputString[k];
			int m = 0;
			
			/*
			 * Now we have to match each character of Both string variables.
			 * 1. LongestCommonPrefix & currentString 
			 */
			while(m < LongestCommonPrefix.length() && m < currentString.length() && LongestCommonPrefix.charAt(m)== currentString.charAt(m))
			{
				m++;
			}
			
			/*
			This simply means even though there are more then 2 strings in the array.
			There is no common prefix between them.
			SO, we just have to written empty String.
			 */
			if(m==0)
			{
				System.out.println("");
			}
			
			/*
			 * if the previous one is not the case, then there is something which is
			 * common between multiple strings in the input array.
			 */
				LongestCommonPrefix = LongestCommonPrefix.substring(0, m);		
				//System.out.println("The longest common prefix is: "+LongestCommonPrefix);
			
		}
		
		System.out.println("The longest common prefix is: "+LongestCommonPrefix);
		
	}
	
}


