package kirtanCodes;

import java.util.*;

public class StackLinkedListMain 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		//Creating an object of StackLinkedList Class.
		StackLinkedList inputObject = new StackLinkedList();
		
		
		boolean condition = false;
		
		do
		{
			System.out.println("Press 1 to PUSH values into Stack LinkedList");
			System.out.println("Press 2 to POP value from Stack LinkedList");
			System.out.println("Press 3 to  get PEEK/TOP value from Stack LinkedList");
			System.out.println("Press 4 to DISPLAY values into Stack LinkedList");
			System.out.println("Press 0 to EXIT");
			
			int userChoice = userInput.nextInt();
			
			switch(userChoice)
			{
				case 1:
					System.out.println("Enter the value you want to push into Stack LinkedList");
					inputObject.push(userInput.nextInt());
					break;
					
				case 2:
					inputObject.pop();
					break;
					
				case 3:
					inputObject.peek();
					break;
					
				case 4:
					inputObject.display();
					break;
					
				case 0:
					condition = true;
					break;
			}
			
		}
		
		while(!condition);
		
	}

}
