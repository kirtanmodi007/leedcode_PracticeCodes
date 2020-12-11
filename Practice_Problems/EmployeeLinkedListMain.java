package job_coding;

public class EmployeeLinkedListMain {

	public static void main(String[] args) 
	{
		//First we have put all the values.
		//Then we have create node and assign those values.
		Employee kirtan = new Employee("Kirtan", "Modi", 07);
		Employee komal = new Employee("Komal", "Modi", 07);
		Employee ruchita = new Employee("Ruchita", "Modi", 19);
		Employee viaan = new Employee("Viaan", "Jain", 26);
		Employee devangi = new Employee("Devangi", "Shah", 17);
		Employee amit = new Employee("Amit","Jain",22);
		Employee cartoon = new Employee("Cartoon","Netwrok",01);
		
		//Creating new Node.
		EmployeeLinkedList newNode = new EmployeeLinkedList();
		
		newNode.insertAtFront(kirtan);
		newNode.insertAtFront(komal);
		newNode.insertAtFront(ruchita);
		newNode.insertAtFront(viaan);
		newNode.insertAtFront(devangi);
		newNode.insertAtEnd(amit);
		newNode.insertAtEnd(cartoon);
		
		newNode.printList();
		newNode.size();
		
		System.out.println("Your LinkedList is Empty " +newNode.isEmpty());
		
		System.out.println("The removed Node is " +newNode.removeNode());
		
		System.out.println("After removing the element the new size and new linked list is");
		
		newNode.printList();
		newNode.size();
	}

}
