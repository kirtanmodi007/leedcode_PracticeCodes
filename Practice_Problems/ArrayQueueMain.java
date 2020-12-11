package job_coding;

public class ArrayQueueMain {

	public static void main(String[] args) 
	{
		Employee kirtan = new Employee("Kirtan", "Modi", 07);
		Employee komal = new Employee("Komal", "Modi", 07);
		Employee ruchita = new Employee("Ruchita", "Modi", 19);
		Employee viaan = new Employee("Viaan", "Jain", 26);
		Employee devangi = new Employee("Devangi", "Shah", 17);
		Employee amit = new Employee("Amit","Jain",22);
		Employee cartoon = new Employee("Cartoon","Netwrok",01);
		
		//Now create the object of QUEUE class.
		ArrayQueue myQueue = new ArrayQueue(10);
		
		
		myQueue.addBack(kirtan);
		myQueue.addBack(komal);
		myQueue.addBack(ruchita);
		myQueue.addBack(viaan);
		myQueue.addBack(devangi);
		//myQueue.addBack(kirtan);
		
		//myQueue.printQueue();
		
		//after removal print again
		System.out.println("The removed element is " +myQueue.removeFront());
		System.out.println("The removed element is " +myQueue.removeFront());
		System.out.println("The removed element is " +myQueue.removeFront());
		System.out.println("The removed element is " +myQueue.removeFront());
		System.out.println("The removed element is " +myQueue.removeFront());
		System.out.println("The removed element is " +myQueue.removeFront());
		
		
		//Printing again after removing the first element.
		System.out.println("AFter removal all the elements ");
		
		myQueue.printQueue();
		
		System.out.println("Current PEEK element in the queue is: "+myQueue.peek());
		
		myQueue.addBack(amit);
		myQueue.addBack(cartoon);
		
		myQueue.printQueue();
		
		System.out.println("Current PEEK element in the queue is: "+myQueue.peek());
		
		
	}

}
