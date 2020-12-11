package kirtanCodes;

import java.util.*;

public class StackParenthesis 
{
	public boolean check(String userinput)
	{
		Stack<Character> myStack = new Stack<Character>();
		
		for(char c: userinput.toCharArray())
		{
			if(c == '[' || c == '(' || c == '{') 
			{
				myStack.push(c);
			}
			
			else if(c == ']' && !myStack.empty() && myStack.peek()== '[')
			{
				myStack.pop();
			}
			
			else if(c == ')' && !myStack.empty() && myStack.peek()== ')')
			{
				myStack.pop();
			}
			
			else if(c == '}' && !myStack.empty() && myStack.peek()== '}')
			{
				myStack.pop();
			}
			
			else
			{
				return false;
			}
		}
		
		return myStack.empty();
	}

}
