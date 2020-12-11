package job_coding;

import java.util.*;

public class LinkedListMain 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		/*
		 * Inorder to access any functions from LinkedList class we have to make its object.
		 */
		LinkedList myObj = new LinkedList();		
		
		boolean exit = false;
		
		do
		{
			System.out.println("Enter 1 to insert into LinkedList");
			System.out.println("Enter 2 to delete particular element from LinkedList");
			System.out.println("Enter 3 to search particular element from LinkedList");
			System.out.println("Enter 4 to display values from LinkedList");
			System.out.println("Enter 0 to exit");
			
			int userInput = input.nextInt();
			
			switch(userInput)
			{
			case 1:
				System.out.println("Enter the value you want to insert");
				int data = input.nextInt();
				myObj.insert(data);
				break;
				
			case 2:
				System.out.println("Enter the element you want to delete from LinkedList");
				data = input.nextInt();
				myObj.delete(data);
				break;
				
			case 3:
				System.out.println("Enter the element you want to delete from LinkedList");
				data = input.nextInt();
				myObj.search(data);
				break;
				
			case 4:
				myObj.display();
				break;
				
			case 0:
				exit = true;
				break;
			}
					
		}
		
		while(!exit);
	}

}
