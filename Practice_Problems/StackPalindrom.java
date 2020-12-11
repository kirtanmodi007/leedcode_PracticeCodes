package kirtanCodes;

public class StackPalindrom 
{
	
	StackLinkedListNode head;
	
	public void checkPalindrom(String userInputString)
	{
		/*
		 * Now we have to read each character and then insert them into stack.
		 * Then we will insert the same stack in reverse order.
		 * If both of them are same, then we can say that the string is palindrom.
		 */
		
		for(int i = 0; i<userInputString.length(); i++)
		{
			System.out.println("Character at " +i +"th index is " +userInputString.charAt(i));
			/*
			 * So, now whatever the character you are getting
			 * Just insert them into STACK.
			 */
			
			push(userInputString.charAt(i));
			
			
		}
		
		display();
		
		/*
		 * Now make an empty String, which will contain
		 * all the string elements in reverse manner
		 */
		
		String reverseString = "";
		
		pop();
		
		/*
		
		for(int i = userInputString.length() - 1 ; i>=0; i--)
		{
			System.out.println("Character at " +i +"th index is " +userInputString.charAt(i));
		}
		
		*/
	}
	
	public void push(char k)
	{
		/*
		 * Creating a Node of StackLinkedListNode class.
		 */
		
		//Created a New Node.
		StackLinkedListNode newNode = new StackLinkedListNode(k,null);
		
		if(head==null)
		{
			/*
			 * This simply means ke whatever Node you have created is the first Node in the 
			 * Stack.
			 */
			head = newNode;
		}
		
		else
		{
			StackLinkedListNode tempNode = null;
			
			tempNode = head;
			
			while(tempNode.next!=null)
			{
				tempNode = tempNode.next;
			}
			
			tempNode.next = newNode;
			
		}
	}
	
	public void display()
	{
		/*
		 * For display purpose also, we have take a temprorary Node.
		 */
		StackLinkedListNode tempNode = head;
		
		while(tempNode.next!=null)
		{
			System.out.println((char)tempNode.data);
			tempNode = tempNode.next;
		}
		
		System.out.println((char)tempNode.data);
	}
	
	public void pop()
	{
		
	}

}
