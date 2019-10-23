package kirtanCodes;

import java.util.Scanner;

/*
 * WE HAD TO DO ALL THIS CODING BECAUSE STRING IN JAVA IS IMUTABLE.
 */
public class ReverseString
{
	
	public String reverseTheString(String S)
	{
		//As we know String in Java is MUTABLE, we cannot directly reverse the string.
		//Thus we are converting the String into CHARACTER ARRAY.
		/*for(char c: S.toCharArray())
		{
			System.out.println(c);
		}
		*/
		
		char[] myCharArray = S.toCharArray();
		
		//We are putting 2 indexes for FRONT and BACK.
		int front = 0;
		int back = S.length() - 1;
		char temp;
		
		while(front < back)
		{
			//Here, we are swapping ith and jth elements.
			temp = myCharArray[front];
			myCharArray[front] = myCharArray[back];
			myCharArray[back] = temp;
			front++;
			back--;
		}
		
		/*
		 * Here, We want to return a STRING, thats' why we are creating an instance of
		 * String class.
		 * So, instead of writing like this, we could have wrote like this.
		 * String myReversedString = new String(myCharArray);
		 * return myReversedString
		 */
		
		/*Here, we haven't created an object of String class but instead
		  we created an INSTANCE of STRING CLASS.
		*/
		return new String(myCharArray);
		
		//return reverseString;
	}
	
	public static void main(String args[])
	{
		//Crating an object of class ReverseString
		ReverseString obj = new ReverseString();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the string you want in reverse order");
		
		String myInput = userInput.nextLine();
		
		//obj.reverseTheString(myInput);
		String reverseString = obj.reverseTheString(myInput);
		
		System.out.println("Your reverse String is: " +reverseString);
		
	}

}
