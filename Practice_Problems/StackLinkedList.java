package kirtanCodes;

public class StackLinkedList 
{
	StackLinkedListNode head;
	
	
	
	
	/*
	 * Method to insert Data into Stack LinkedList
	 */
	public void push(int data)
	{
		/*
		 * So,whenever a push method is called, we will create a new Node,
		 * and give its data & link/reference part would be null
		 */
		StackLinkedListNode newNode = new StackLinkedListNode(data,null);
		
		if(head == null)
		{
			/*
			 * This simply means there were no preview nodes.
			 */
			head = newNode;			
		}
		
		else
		{
			/*
			 * Temperory pointer variable
			 */
			
			//Means ke u created a NEW TEMP node, and assigned it as head node.
			StackLinkedListNode tempNode = head;
			
			/*
			 * Stack implementation ma New Node ae front ma ADD thay.
			 */
			
			head = newNode;
			newNode.next = tempNode;
			
			
		}
	}
	
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Your Stack is Empty");
		}
		else
		{
			System.out.println("Poped Item is: " +head.data);
			head = head.next;
			
		}
	}
	
	public void peek()
	{
		System.out.println("The peek item in stack is: " +head.data);
	}
	
	public void display()
	{
		StackLinkedListNode temp = head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println(temp.data);
	}
}
