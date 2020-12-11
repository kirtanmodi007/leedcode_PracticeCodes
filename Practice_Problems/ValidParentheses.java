package kirtanCodes;

/* LEETCODE: 20
 * 
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	determine if the input string is valid.
	
	An input string is valid if:
	
	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Note that an empty string is also considered valid.
	
	Example 1:
	
	Input: "()"
	Output: true
	
	Example 2:
	
	Input: "()[]{}"
	Output: true
	Example 3:
	
	Input: "(]"
	Output: false
	Example 4:
	
	Input: "([)]"
	Output: false
	Example 5:
	
	Input: "{[]}"
	Output: true  
*/
import java.util.*;

public class ValidParentheses 
{
	public static void main(String args[])
	{
		//Here, we can use the concept of STACK, to see what is their in the stack.
		//Then, we can compare stack values according to the given  conditions. 
		
		//To take user input we must have an object of scanner class.
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the parenthesis you want");
		
		/*Making object of the same class to call the getValidation function.
		To check the validation of user inserted String*/
		
		ValidParentheses newObj = new ValidParentheses();
		
		//We will get an string from user.
		/*We will pass this user input string to the next function for
		checking the validation of parenthesis. */
		
		//SO, here userinput variable (Type String) would have user inserted string.
		String userinput = userInput.nextLine();
		
		//We will pass thisn userInput string to our validation function.
		
		//We will only get TRUE or FALSE value from our validation function.
		boolean answer = newObj.getValidation(userinput);
		
		System.out.println("The answer is: " +answer);
		
	}
	
	/*
	 * MAIN LOGIC OF CODE IS HERE
	*/
	
	public boolean getValidation(String userinput)
	{
		
		//Now in order to store userinput you will use stack concept
		Stack<Character> myStack = new Stack<Character>();
		
		/*
		Here, whenver you see any OPENING bracket of what so ever type
		push it into Stack.
		But whenever you see closing bracket, match that value with the top of the 
		Stack.
		If top of the stack and last inserted CLOSING parentehesis are same then,
		Then pop the STACK TOP. Return true until the whole Stack is EMpty.
		*/
		
//********************************** ACTUAL LOGIC OF CODE *******************************
		//Convert the user Inserted String into CHARACTER ARRAY.
		for(char c: userinput.toCharArray())  //Now you are reading each & every character.
		{
			if(c =='{' || c=='(' || c=='[')
			{
				//SO,whever we see any opening parenthsesis we have to push it into stack.
				myStack.push(c);
			}
			
			
			else if(c==']' && !myStack.isEmpty() && myStack.peek()=='[')
			{
				myStack.pop();
			}
			
			else if(c==')' && !myStack.isEmpty() && myStack.peek()=='(')
			{
				myStack.pop();
			}
			
			else if(c=='}' && !myStack.isEmpty() && myStack.peek()=='{')
			{
				myStack.pop();
			}
			
			else
			{
				return false;
			}
			
		}
		
		return myStack.isEmpty();
		
	}
	
			//After all doing, if our stack is empty then return true. else false
			
			
				
				/*SO, whenever you get any clssing parenthsesis
				Match that value with stack's top. if both are same, 
				go through the same process still your stack becomes empty. */
}
