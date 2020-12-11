package kirtanCodes;

import java.util.*;
/*
	Given a string, find the first non-repeating character in it and return it's index. 
	If it doesn't exist, return -1.
	
	Examples:
	
	s = "leetcode"		//Here, 1st unique character is L, because its not repeated in
						  whole string.
	return 0.
	
	s = "loveleetcode",	//WHile here, 1st unique character is v, which is at index 2,
						  because L & O are repeated somewhere in same string.
	return 2.
*/


public class FirstUniqCharInStr 
{
	public static void main(String args[])
	{
		//Here, we will take only Single String from user.
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("ENter your String");
		
		String userInputString = userInput.nextLine();
		
		/*
		Now, we will pass this string to function, which will return the index of first
		unique character.
		 */
		
		//We have to create an object of class FirstUniqCharInStr, to access its functions.
		FirstUniqCharInStr obj = new FirstUniqCharInStr();
		
		int uniqueIndex = obj.UniqueCharIndex(userInputString);
		
		System.out.println("THe unique character index is: " +uniqueIndex);
	}
	
	/*
	 * This function contains the actual logic of WHOLE CODE.
	 */
	public int UniqueCharIndex(String userInputString)
	{
		int uniqueIndex=-1;
		
		/*
		 * So, now here we have to loop through each character in the string.
		 * And check whether the characters are matching with each other or not.
		 */
		for(int i = 0; i<userInputString.length(); i++)
		{
			//char comp = userInputString.charAt(i);
			
			for(int j = i+1; j<userInputString.length(); j++)
			{
				while(userInputString.charAt(i)==userInputString.charAt(j))
				{
					j++;
				}
				
				else
				{
					uniqueIndex = j;
				}
			}
			
			
		}
		
		return uniqueIndex;
	}

}
