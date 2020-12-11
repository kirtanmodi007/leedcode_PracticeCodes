package job_coding;

public class EmployeeDoublyLinkedListMain {

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
		
		//Now we have create an object of Doubly Linked List class
		//WHere we are going to insert all this employee values.
		EmployeeDoublyLinkedList newNode = new EmployeeDoublyLinkedList();
		
		//NOw just put values into all those nodes.
		newNode.frontAdd(kirtan);
		newNode.frontAdd(komal);
		newNode.frontAdd(ruchita);
		newNode.frontAdd(viaan);
		newNode.frontAdd(devangi);
		
		
		newNode.PrintList();
		
		//newNode.tailAdd(amit);
		//newNode.tailAdd(cartoon);
		
		newNode.PrintList();
		
	}

}
