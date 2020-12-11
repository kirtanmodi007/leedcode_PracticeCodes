package kirtanCodes;

import java.util.*;

/*
 * THIS CODE SHOWS THE STACK"S ARRAY REPRESENTATION.
 */

//It's main class for stackArray code, where actual implementation starts.

public class StackArrayMain 
{
	public static void main(String args[])
	{
		//Creating an object of StackArray class, in order to call functions.
		StackArray stack = new StackArray();
		
		Scanner obj = new Scanner(System.in);
		
		boolean check = false;
		
		do
		{
			System.out.println("Press 1 to Push elements into Stack");
			System.out.println("Press 2 to Pop element from Stack");
			System.out.println("Press 3 to Peek/Top element from Stack");
			System.out.println("Press 4 to check stack is empty or not");
			System.out.println("Press 5 to Display all the elements of Stack");
			System.out.println("Press 0 to Exit the Stack");
			
			int userChoice = obj.nextInt();
			
			switch(userChoice)
			{
			case 1:
				System.out.println("Enter the value you want to push");
				int value = obj.nextInt();
				stack.push(value);
				break;
				
			case 2:
				stack.pop();
				break;
				
			case 3:
				stack.peek();
				break;
				
			case 4:
				stack.isEmpty();
				break;
				
			case 5:
				stack.display();
				break;
				
			case 0:
				//So, whenever you come in case 0, your program will stop execution.
				//Because here, we are making our boolean variable TRUE.
				check = true;
				break;
			
			}
			
		}
		
		/*
		 * This simplly means, till the time check doesn't become true 
		 * we will continue implementing do-while loop.
		 */
		while(!check);
	}

}
