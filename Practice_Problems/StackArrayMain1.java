package kirtanCodes;

import java.util.*;

/*
 * This will be main  class for Stack's Array Representation.
 */
public class StackArrayMain1 
{
	public static void main(String args[])
	{
		//Making an object of scanner class, to take user Input		
		Scanner userInput = new Scanner(System.in);
		
		//Creating an object of StackArray1 class, which contains all the methods.
		StackArray1 obj = new StackArray1();
		
		//Making a DO-WHILE loop for menu purpose. But before that I need a boolean variable.
		
		boolean temp = false;
		
		do
		{
			System.out.println("Press 1 to PUSH the values");
			System.out.println("Press 2 to POP the values");
			System.out.println("Press 3 to get TOP of the Stack");
			System.out.println("Press 4 to check isEmpty");
			System.out.println("Press 5 to display/print the Stack");
			System.out.println("Press 0 to exit");
			
			//We have to store userChoice in some variable.
			int userChoice = userInput.nextInt();
			
			switch(userChoice)
			{
			case 1:
				System.out.println("Enter the value");
				obj.push(userInput.nextInt());
				break;
				
			case 2:
				obj.pop();
				break;
				
			case 3:
				obj.top();
				break;
				
			case 4:
				System.out.println(obj.isEmpty());
				break;
				
			case 5:
				obj.display();
				break;
				
			//If a person enters 0, that means he wants to end the program here.
			//So, we have to change the value of boolean variable.
			case 0:
				temp = true;
				break;
			}
		}
		
		while(!temp);
		
	}

}
