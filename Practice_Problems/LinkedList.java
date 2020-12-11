package job_coding;

/*
 * This class will contain all the methods / functions related to LinkedList.
 */

public class LinkedList 
{
	/*
	 * Create Node type variable head, and assign value null to it.
	 */
	//This head node will refer to the first node of linkedlist.
	Node head;
	
	public void insert(int data)
	{
		/*
		 * Here, we have to create an object for Node class.
		 * Because whenever we want to add any value into LinkedList we have to create a new Node.
		 * After creating new node we have to assign that node , next node's link.
		 * Node is an Abstract Data Type.
		 * which has value and link / address to next Node.
		 */
		
		Node myNode = new Node(data, null);
		
		/*
		 * Before providing any link we have to check whether it is the first node of linked list or not.
		 * Because if the inseting node is the first node of the LinkedList.
		 * Then we have to set our head node refering to first Node.
		 */
		if (head == null)
		{
			//Jo initially maru LinkedList empty hoy to, first node hu je create karu 
			//ae j maro head node bani jay.
			head = myNode;
		}
		else
		{
			//Create a temperory node to traverse through the whole linkedlist.
			//Temp node ne tu head node assign kar;
			
			Node tempNode;
			tempNode = head;
			
			while(tempNode.next!=null)
			{
				tempNode = tempNode.next;
			}
			
			tempNode.next = myNode;
		}
	}
	
	
	
	public void search(int data)
	{
		
	}
	
	public void delete(int data)
	{
		if(head.data == data)
		{
			head = head.next;
		}
		
		else 
		{
			Node temp;
			temp = head;
			
			while(temp.next!=null)
			{
				if(temp.next.data == data)
				{
					temp.next = temp.next.next;
					break;
				}
				
				else
				{
					temp = temp.next;
				}
			}
		}
	}
	
	public void display()
	{
		/*
		 * In order to display LinkedList elements we have to traverse through whole LinkedList.
		 * For that we need to create an temperory Node.
		 */
		
		Node tempNode;
		tempNode = head;
		
		
		if(head.next == null)
		{
			System.out.println("Yor list is empty");
		}
		
		else
		{
			
		while(tempNode.next!=null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
		/*
		 * To print the last node.
		 */
		
		System.out.println(tempNode.data);
		}
	}
}
