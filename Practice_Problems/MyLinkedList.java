package kirtanCodes;

public class MyLinkedList 
{
	//1st of all You have to have 1st Node of LinkedList as HEAD NODE.
	Node head;		/*HEAD NODE DOESN'T CONTAIN ANY DATA. It will link / point the 
						//1st NODE of LINKEDLIST. */
	
	/*
	Create an constructor of MyLinkedList class. Pass HEAD NODE in its argument / parameter
	 */
	
	
	
	public void insert(Node head, int value)
	{
		//Now, you have to create an object of node class.
		
		//this.head = head;
		
		//SO, you are creating a NEW NODE & giving it it's data and link as null.
		Node myNode = new Node(value,null);
		
		/*
		 * Now, after creating the node and giving its value,
		 * we have to SET the POINTERS / LINK of that NODe.
		 */
		
		/*
		 *This means ke mari pase hal linkelist ma kai nahotu
		 *before inserting this particular 1st node. 
		 *So, the link part of Head will be null. 
		 */
		
		
		if(head == null)
		{
			/*
			 * If your head's link is null, then we have to adjust our 1st Node
			 * & head node.
			 */
			
			head = myNode;
		}
		
		/*
		 * If the newly created node is not the first node of your linkedlist.
		 * Then our code will jump to ELSE PART.
		 */
		
		else
		{
			/*
			 * So, now you have to traverse till the last newly added node
			 * and you should link your 2nd last node with the last node.
			 */
			
			/*
			 * Beofre travel begin, you have to declare your head node as TEMP node.
			 */
			
			Node tempNode = head;	//Currently head Node becomes your temporary node.
			
			
			
			while(tempNode.next!=null)
			{
				tempNode = tempNode.next;
			}
			
			tempNode.next = myNode;
			
			
		}
	}
	
	
	
		
	/*
	 * This function is used to print the linkedlist.
	*/	
	public void display(Node head)
	{
		/*
		 * Jya sudhi tara node no link part null na aawe tya sudhi nOde ne print karaw.
		 * */
		
		//this.head = head;
		
		//For printing purpose also, you have to declare your HEAD node as TEMP node.
		Node tempNode = head;

		
		while(tempNode.next!=null)
		{
			System.out.println(tempNode.data);
			
			tempNode = tempNode.next;
		}
		
		//As the last node, won't have any link we have to print it.
		
		System.out.println(tempNode.data);
		
		
	}
}
