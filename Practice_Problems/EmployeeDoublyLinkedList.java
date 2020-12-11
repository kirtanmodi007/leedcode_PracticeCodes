package job_coding;

//This class will contain all the methods related to Doubly Linked List Operations.
public class EmployeeDoublyLinkedList 
{
	//What we need is a reference in the beginning
	private EmployeeDoublyNode head;
	private EmployeeDoublyNode tail;
	
	
	//Add to the front of Doubly Linked List
	public void frontAdd(Employee employee)
	{
		//Jewo insert wadi method ma tu aawe ke tarat j tare 1 new node to 
		//create karwo j padshe.
		//Whenever you are inserting the data from the FRONT of LINKED LIST.
		//Tail's value doesn't get changed.
		//But if the node we are adding is the first node, then we have to 
		//think about Tail as well.
		
		EmployeeDoublyNode myNode = new EmployeeDoublyNode(employee);
		myNode.setNext(head);
		
		//This simply means we are adding into empty list.
		//So, we have to set Our tail as well.
		if(head == null)
		{
			tail = myNode;
		}

		
		//Else part simply means you have something in your LinkedList.
		//Your linkedlist was not empty.
		else
		{
			//Traversal mate create 1 temperory node.
			//EmployeeDoublyNode temp = head;
			
			//head.setNext(myNode);
			head.setPrev(myNode);		
			
		}
		
		head = myNode;
		
		
	}
	
	
	//Now we are inserting into END OF THE LINKEDLIST
	public void tailAdd(Employee employee)
	{
		//Every time you come inside this function, firstly 
		//you have to create a node.
		EmployeeDoublyNode myNode = new EmployeeDoublyNode(employee);
		
		if(tail==null)
		{
			head = myNode;
		}
		
		else
		{
			tail.setNext(myNode);
			myNode.setPrev(tail);
			myNode.setNext(null);
			tail = myNode;
		}			
	}
	
	public void PrintList()
	{
		//List ne print karwa all you need is a reference point
		EmployeeDoublyNode temp = head;
		
		while(temp!=null)
		{
			System.out.println(temp);
			temp = temp.getNext();
		}
		
	}
	
}
