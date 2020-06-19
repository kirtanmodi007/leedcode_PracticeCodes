package job_coding;

import java.util.*;

public class StackArray 
{
	public static void main(String args[])
	{
		Scanner myinput = new Scanner(System.in);
		
		System.out.println("WELCOME TO STACK REPRESENTATION USING ARRAY");
		
		boolean exit = false;
		
		
		//We are making another STACK class to implement all its functionalities.
		StackArrayImplementation myObj = new StackArrayImplementation();
		
		
		/*
		 * Till the time boolean variable 'EXIT' doesn't become false we have to implement,
		 * the do-while loop for continues execution of our code. 
		 */
		do
		{
			System.out.println("Enter 1 to PUSH into Stack");
			System.out.println("ENter 2 to POP from stack");
			System.out.println("Enter 3 to view TOP / PEEK element from stack");
			System.out.println("Enter 4 to DISPLAY the stack");
			System.out.println("Enter 0 to exit the stack");
			
			int userInput = myinput.nextInt();
			
			switch(userInput)
			{
				case 1:
					System.out.println("ENter the number you want to insert into stack");
					int myNumber = myinput.nextInt();
					myObj.push(myNumber);
					break;
					
				case 2:
					myObj.pop();
					break;
					
				case 3:
					myObj.peek();
					break;
					
				case 4:
					myObj.display();
					break;					
				
				case 0:
					System.out.println("Thank You!");
					exit = true;
					break;
			}
				
		}
		
		while(!exit);
		
	}

}

