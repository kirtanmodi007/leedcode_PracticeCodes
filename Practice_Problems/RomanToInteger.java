package kirtanCodes;

import java.util.*;

/*
 * QUESTION
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
	
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	
	I can be placed before V (5) and X (10) to make 4 and 9. 
	X can be placed before L (50) and C (100) to make 40 and 90. 
	C can be placed before D (500) and M (1000) to make 400 and 900.
	Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
	
	Example 1:
	
	Input: "III"
	Output: 3
	Example 2:
	
	Input: "IV"
	Output: 4
	Example 3:
	
	Input: "IX"
	Output: 9
	Example 4:
	
	Input: "LVIII"
	Output: 58
	Explanation: L = 50, V= 5, III = 3.
	Example 5:
	
	Input: "MCMXCIV"
	Output: 1994
	Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * */

public class RomanToInteger
{
	public static void main(String args[])
	{
		
		/*
		 * So, here we can use the concept of HASHMAP, to make a reference between
		   a ROMAN character & its INTEGER VALUE
		 */
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the ROMAN String");
		
		String userinput = userInput.nextLine();
		
		//Before calling the function, we have to make a object of same class.
		
		RomanToInteger newObj = new RomanToInteger();
		
		//Pssing the ROMAN STRING TO THE FUCNTION & it will return the INTEGER VALUE.
		int RomanToInteger = newObj.convertedInteger(userinput);
		
		System.out.println("The converted Integer values is: " +RomanToInteger);
		
	 }
	
	public int convertedInteger(String userinput)
	{
		//If the userInput string is empty or null, return 0
		if (userinput == null || userinput.length()== 0)
		{
			return 0;
		}
		
		else
		{
			/*Now we can initialize the HASH MAP TABLE,
			for mapping purpose */
			//In the mapping table ,we are actually mapping STRING to INTEGER
			Map<Character,Integer> mappingObject = new HashMap<Character,Integer>();
			
			//SO, now we will inserte each KEY ---> VALUE pair into our HashTable
			mappingObject.put('I',1);
			mappingObject.put('V',5);
			mappingObject.put('X',10);
			mappingObject.put('L',50);
			mappingObject.put('C',100);
			mappingObject.put('D',500);
			mappingObject.put('M',1000);
			
			
			//Now we need lrngth of our input string
			int length = userinput.length();
			
			/*
			First of all we are putting the value which is equivalent to the
			last character in String.
			So, if the last character of input string is X, then first of all
			with the help of HashMap we will get an integer value for that character.
			*/
			int returnResult = mappingObject.get(userinput.charAt(length - 1));
			
			/*
			Since, we are adding / subtracting number/characters from
			Right to left, my indexing actually starts at the last index of string.
			Which simply means I have to start looping from last character to
			veryfirst character available at index 0.
			But in previous line we covered the last character of Character String.
			So, now we have to start looping through 2nd last character of String.
			 */
			for(int i = length - 2; i>=0; i--)
			{
				/*
				If the value on left side is larger then the value on right side,
				then we don't have any issue.
				We just have to add those numbers from right to left.
				*/
				if(mappingObject.get(userinput.charAt(i)) >= mappingObject.get(userinput.charAt(i+1)))
						{
							/*
							 * if this is true then we can just directly add,
							 * those numbers with the last indexed value, which
							 * we got initially in returnResult variable.
							 * So, now simply add all the calculation in that returnResult 
							 * variable
							 * */
								returnResult = returnResult +  mappingObject.get(userinput.charAt(i));
						}
				
				else
						{
							
								returnResult = returnResult -  mappingObject.get(userinput.charAt(i));
						}
			}
			
			return returnResult;
			
		  }
	}
}
