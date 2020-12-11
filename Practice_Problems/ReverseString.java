package job_coding;

import java.util.*;

public class ReverseString 
{
	
	
	 public void reverseString(String s) 
	    {
	        Stack<Character> myStack = new Stack<Character>();  
	        
	        for(int i = 0; i < s.length(); i++)
	        {
	            myStack.push(s.charAt(i));
	        }
	        
	        //Pop into same array again
	        
	        String abc = "";
        
	              while(!myStack.isEmpty())
	                {
	                     int i = 0; 
	                     abc = abc+myStack.pop();
	                    i = i+ 1;
	                }
	        
	              System.out.println(abc);
	              
	              //APPROACH 2:
	              //low high  walo
	              
	              int low = 0;
	              int high = s.length() - 1;
	              
	              while(low < high)
	              {
	            	  char temp = s.charAt(low);
	            	  low = s.charAt(high);
	            	  high = temp;
	              }
	              
	              System.out.println(s);
	         
	             /*
	            
	             
	        for(int i = 0; i < s.length; i++)
	        {
	        	System.out.println(s[i]);
	        }
	        
	        */
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		ReverseString obj = new ReverseString();
		
		String myString = "hello";
		
		//char[] myStringArray =  myString.toCharArray();
		
		obj.reverseString(myString);
		   
	}
}
