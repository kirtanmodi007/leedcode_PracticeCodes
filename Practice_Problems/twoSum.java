package job_coding;

import java.util.*;

public class twoSum
{
	public void reverseString(char[] s) 
    {
        Stack<Character> myStack = new Stack<Character>();
        
        for(int i = 0; i < s.length; i++)
        {
            myStack.push(s[i]);
        }
         
        //Now we have to pop every element till the time our stack becomes empty.
        
        while(!myStack.isEmpty())
        {
        	for(int j = 0; j < s.length; j++)
        	{
        		s[j] = myStack.pop();
        	}
        	
        }
  
    System.out.println(s);
    }
	
	
	public static void main(String args[])
	{
		    Scanner myScannerObj = new Scanner(System.in);
		    
		    System.out.println("Enter the string");
		    
		    String myString = myScannerObj.nextLine();
		    
		    //COnverted our string into charcter array
		    char[] s = myString.toCharArray();
		    
		    //Creating an object of class to call other methods.
		    twoSum myObj = new twoSum();
		    
		    myObj.reverseString(s);
		    
	}
}
