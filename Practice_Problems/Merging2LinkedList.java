/*
 * CODE 21
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.

	Example:
	
	Input: 1->2->4, 1->3->4
	Output: 1->1->2->3->4->4
*/


package kirtanCodes;

import java.util.*;


public class Merging2LinkedList 
{
	public static void main(String args[])
	{
		
		Scanner userInput = new Scanner(System.in);	
		
		
		/*
		 * Ask the user to Enter 2 ALREADY SORTED LINKED LIST (Ascending Order)
		 */
		
		/*
		 * I want to take userInput in linkedlist till the time, user don't press
		   exit button. For that I have to use DO - WHILE CONCEPT
		 */
		
		
		
		/**************************FIRST LINKEDLIST ******************************/				
		/*
		 * DO-WHILE LOOP FOR 1ST LINKEDLIST
		 */
		

		/*
		   Here, I am creating an object of MyLinkedList Class.
		   I could have used inbuilt LinkedList class.
		   But I am trying to make my own linkedlist class & the Merge them.
		 */
		 MyLinkedList newLinkedList1 = new MyLinkedList();
		 Node head1 = null;
		
		boolean conditionVariable1 = false;
		
		int value1;
				
		do
		{
			System.out.println("Press 1 to insert values into 1st LinkedList");
			System.out.println("Press 2 to print 1st Linkedlist");
			System.out.println("Press 0 to Exit");
			
			int userInsertedValue = userInput.nextInt();
			
			switch(userInsertedValue)
			{
			case 1:
				
				
				System.out.println("How many values you want in linkedlist 1");
				int valuesNeeded1 = userInput.nextInt();
				
				for(int i =0; i<valuesNeeded1; i++)
				{
				
					System.out.println("Enter the values");
					value1 = userInput.nextInt();				
					newLinkedList1.insert(head1,value1);	
				}
				
				break;
				
			case 2:
				newLinkedList1.display(head1);
				break;
				
			case 0:
				conditionVariable1 = true;
				break;
			}
			
			
		}
		
		/*The do while loop will run till the time, our "conditionVariable1" doesn't
		become true. */
		while(!conditionVariable1);
		
		
		
/**************************SECOND LINKEDLIST ******************************/		
		/*
		   Here, I am creating an object of MyLinkedList Class.
		   I could have used inbuilt LinkedList class.
		   But I am trying to make my own linkedlist class & the Merge them.
		 */
		 MyLinkedList newLinkedList2 = new MyLinkedList();
		 Node head2 = null;
		

		
		/*
		 * DO-WHILE LOOP FOR 2ND LINKEDLIST
		 */
		boolean conditionVariable2 = false;		
		int value2;
				
		do
		{
			System.out.println("Press 1 to insert values into 2nd LinkedList");
			System.out.println("Press 2 to print 2nd Linkedlist");
			System.out.println("Press 0 to Exit");
			
			int userInsertedValue = userInput.nextInt();
			
			switch(userInsertedValue)
			{
			case 1:
				
				
				
				System.out.println("How many values you want in linkedlist 2");
				int valuesNeeded2 = userInput.nextInt();
				
				for(int i =0; i<valuesNeeded2; i++)
				{
				
					System.out.println("Enter the values");
					value2 = userInput.nextInt();				
					newLinkedList2.insert(head2, value2);
				}
				
				break;
				
			case 2:
				newLinkedList2.display(head2);
				break;
				
			case 0:
				conditionVariable2 = true;
				break;
			}
			
			
		}
		
		/*The do while loop will run till the time, our "conditionVariable1" doesn't
		become true. */
		while(!conditionVariable2);
		
		
/***************ACTUAL MERGING 2 LINKEDLIST LOGIC START HERE****************/
		
		//Creating an object of same class, to call the function.
		//Now you will pass 2 linkedlist 2 to Merge function.
		Merging2LinkedList newObj = new Merging2LinkedList();
		
		
		Node mergeNode = newObj.MergingLogic(head1,head2);
		
		while(mergeNode.next!=null)
		{
			System.out.println(mergeNode.data);
			mergeNode = mergeNode.next;
		}
		
		System.out.println(mergeNode.data);
	}
	
	
	//Just like int data, here we will have NODE TYPE of data.
	//Here, I will return a MERGED LINKEDLIST of TYPE NODE.
	public Node MergingLogic(Node n1, Node n2)
	{
		/*So, now we are creating a dummy list and in the end we will, 
		return this dumpy List. Because this dumy list will become our MERGED LIST
		*/
		
		
		Node dumyNode = new Node(-1,null);
		
		//Now we will make this dumy node as HEAD node of our MERGING LINKED LIST.
		Node head = dumyNode;
		
		while(n1 !=null && n2!= null)
		{
			//We have to compare both list's value.
			/*
			 * Comparison starts from BOTH the LIST's 1st ELEMENT
			 */
			if(n1.data < n2.data)
			{
				//if 1st Linkedlist's data is small, then put it into dumy list.
				dumyNode.next = n1;
				dumyNode = dumyNode.next;
			}
			
			//n2's data is smaller
			else
			{
				dumyNode.next = n2;
				dumyNode = dumyNode.next;
			}
			//AFter every iteration we have to move our DUMY NODE's POINTER.
			//That's why we make our DumyNode = DumyNode.next
			dumyNode = dumyNode.next;
		}
		
		//What if - out of those 2 linkedlist , we are done visiting 1 whole list.
		//Then in that case we just have to add 2nd list into our dumy list.
		
		//This means we have added all the nodes of LINKEDLIST 1 into our Dumy list.
		if(n1==null)	//This means we have to put whatever is left in LINKEDLIST 2
		{
			dumyNode.next = n2;
			dumyNode = dumyNode.next;
		}
		
		else
		{
			dumyNode.next = n1;
			dumyNode = dumyNode.next;
		}
		
		
		//Printinh the dumy list
		
		Node tempNode = head;
		
		while(tempNode.next!=null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
		//Printing the last node of MERGED LIST
		System.out.println(tempNode.data);
		
		/*
		 * Now we have to compare both the linkedlist's 1st element.
		 */
		
		return head.next;
	}

}
