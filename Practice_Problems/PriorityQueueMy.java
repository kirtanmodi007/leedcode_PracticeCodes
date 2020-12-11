package job_coding;

import java.util.PriorityQueue;

public class PriorityQueueMy {

	public static void main(String[] args) 
	{
		//Implementing Priority QUEUE using java's inbuilt PriorityQueue class
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a > b?-1:1);
		
		//By default this priorityQueue will follow MIN - HEAP properties.
		//So, the MINIMUM value will be at the root.
		pq.add(10);
		pq.add(2);
		pq.add(1);
		pq.add(5);
		pq.add(122);
		pq.add(-122);
		
		//pekk will not remove the element, just print
		System.out.println("The smallest value in PQ is: "+pq.peek());
		while(!pq.isEmpty())
		{
			System.out.println("Currently the smallest value is: " +pq.poll());
		}
		
		//We can make changes in our PRIORITY QUEUE's CUSTOM COMPARATOR,
		//to implement MAX - HEAP.
		
	}

}
