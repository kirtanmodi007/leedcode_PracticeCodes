package job_coding;

//This class will only work for Employee class, as we haven't make any generics.
//Node type no data hase tari pase.
public class EmployeeLinkedList 
{
	//LinkedList ne traverse karwa / New Node insert karwa / old node delete karwa
	//All we need is a refernce to the starting point.
	//After then we can TRAVERSE ENTIRE LINKEDLIST.
	
	private EmployeeNode head;
	private int size;
	
	
	public void insertAtFront(Employee employee)
	{
		//Front ma node nakhwo 6e, which simply means ke tare new node create karwano.
		//And pahela head refer kartu tu je next node ne, aeni jgya ae have new node
		//ae head node ne refer karshe.
		
		EmployeeNode newNode = new EmployeeNode(employee);
		
		/*
		if(head==null)
		{
			head = newNode;
		}
		*/
		
		newNode.setNext(head);
		head = newNode;	
		size++;
	}
	
	public void insertAtEnd(Employee employee)
	{
		// Every time insert method call thay ke first step is to create a new node.
		//Above line simply depicts you have created a new node.
		EmployeeNode newNode = new EmployeeNode(employee);
		
		/*
		 * This simply means ke jo head pote j null hoy, means ke
		 * aeni pase koi j node nu address nathi.
		 * that means taru linkedlist empty 6e.
		 * If your linkedlist is empty then whatever node you created will be your head node.
		 */
		if(head==null)
		{
			head = newNode;
			size++;
		}
		
		//If head is not null, that means there exists some node inside your LinkedList
		//So, we have to traverse untill we get the node, whose next node is null.
		//But for traversal we have to make a temperory node.
		else
		{
			EmployeeNode temp = head;
			
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
			size++;
			
			//Jewo null thay ke tu new node ni link set kari de.
		}
	}
	
	public void printList()
	{
		
		if(head.getNext()==null)
		{
			System.out.println("Nothing exits in your list");
		}
		
		else
		{
		EmployeeNode current = head;
			
			//Again to traverse the LinkedList , we have create a REFERENCE NODE.
			while(current!=null)
			{
				System.out.println(current);
				current = current.getNext();
			}
		}
	}
	
	//Remove elements from first
	public EmployeeNode removeNode()
	{
		if(head==null)
		{
			System.out.println("The LinkedList is empty, so you can't remove anything");
		}
		
			//Just link set kari de.
			EmployeeNode temp = head;
			head = temp.getNext();
			temp.setNext(null);
			size--;		
		return temp;
	}
	
	public void size()
	{
		System.out.println("The current size of LinkedList is: " +size);
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		
		return false;
	}
}
