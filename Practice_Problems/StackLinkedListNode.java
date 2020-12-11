package kirtanCodes;

public class StackLinkedListNode 
{
	int data;
	StackLinkedListNode next;
	Character data1;
	
	/*
	 * For Integer Value Constructor
	 */
	StackLinkedListNode(int data, StackLinkedListNode next)
	{
		this.data = data;
		this.next = next;
	}
	
	/*
	 * For Character Value Construcor.
	 */
	StackLinkedListNode(Character data1, StackLinkedListNode next)
	{
		this.data1 = data1;
		this.next = next;
	}

}
