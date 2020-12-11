package kirtanCodes;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the integer value to check whether its palindrom");
		
		int userInputValue = userInput.nextInt();
		
		//Creating an object of same class
		PalindromeNumber newObj = new PalindromeNumber();
		
		//Now call a fucntion to reverse the user input number
		Boolean palindromeNumber = newObj.isPalindrome(userInputValue);
		
		System.out.print("The reversed Number is: "+palindromeNumber);
	}
	
	public boolean isPalindrome(int userInputValue)
	{
		if(userInputValue == 0)
		{
			return true;
		}
		
		if(userInputValue<0 || userInputValue % 10 == 0 )
		{
			/*Because according to the question if the number is negartive
			it cannot be a Palindrome Number.*/
			return false;
		}
		
		//Now we will use the same logic as ReverseInteger.
		/*In the last just check whther userInserted value and Reversedvalues are
		same or not. */
		
			int palindromeNumber = 0;
			
			while(userInputValue!=0)
			{ 
				int remainder = userInputValue % 10;
				palindromeNumber = palindromeNumber * 10 + remainder;
				userInputValue = userInputValue / 10;
			}
			
			System.out.println(palindromeNumber);
			
			if(userInputValue == palindromeNumber)
			{
				return true;
			}
			else
			{
				return false;
			}
		
	}
}
