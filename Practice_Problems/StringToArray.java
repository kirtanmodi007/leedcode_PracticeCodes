package kirtanCodes;

import java.util.Scanner;

/*
  QUESTION: Given a non-empty string and an int n, 
  return a new string where the char at index n has been removed. 
  The value of n will be a valid index of a char in the original string 
  (i.e. n will be in the range 0..str.length()-1 inclusive).
  
		missingChar("kitten", 1)  "ktten"
		missingChar("kitten", 0)  "itten"
		missingChar("kitten", 4)  "kittn"
*/

public class StringToArray 
{
	 public static void main(String[] args)
	 {
		 /*
		  * Here, we have to create an object of Character_Missing class,
		  * in order to access its methods.
		  */
		 
		 /*Before passing the string and index to the function,
		 we have to use scanner class to get user input string & index.*/
		 
		 Scanner userInput = new Scanner(System.in);
		 //Taking user input
		 System.out.println("Enter the string");
		 String userInsertedString = userInput.nextLine();
		 
		 System.out.println("Enter the index from where you want to remove char");
		 int userInsertedIndex = userInput.nextInt();
		 
		 /*Now we have to cretae object of Character_Missing class,
		 to call its function.*/
		 /*
		  * Here, we will pass both index value and string to the fucntion.
		  * Here, the fucntion will return new string
		  * */
		 Character_Missing newObject = new Character_Missing();
		 String newRemovedCharacterString = newObject.missingCharacter(userInsertedString, userInsertedIndex);
		 
		 //Printing the removed character string
		 System.out.println("The newly removed string is: " +newRemovedCharacterString);
		 
		 
	 }
}

class Character_Missing
{
	public String missingCharacter(String inputString, int index)
	{
		/*
		 * To remove an element from particular index, we can simply use 
		 * substring concept
		 */
		
		//Here, we are using inbuilt java function subString.
		//We are providng the star and End index, 
		//We are concating 2 substring, by only eliminating that particular character
		
		try
		{
		
		String characterRemovedString = inputString.substring(0, index) + inputString.substring(index+1, inputString.length());		
		
		
		return characterRemovedString;
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			throw e;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			throw e;
		}
	}
}
