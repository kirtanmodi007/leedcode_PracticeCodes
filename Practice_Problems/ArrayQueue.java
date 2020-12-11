package job_coding;

public class ArrayQueue 
{
	/*We need 3 things in QUEUE.
	1 the data field.
	2nd the front pointer
	3rd the tail pointer
	*/
	
	//taro data object type no hase.
	//Tu queue ma 1 aakho object pan insert kari shake 6e.
	//Here, we could have create the QUEUE with any specific generic, like int / float.
	//But we are creating QUEUE of EMPLOYEE OBJECT type.
	private Employee queue[];
	private int front = 0;
	private int tail = 0;
	
	//In the constructor user will say, how much length's queue he / she require.
	public ArrayQueue(int queueSize)
	{
		queue = new Employee[queueSize];
	}
	
	//Adding in the back of QUEUE
	public void addBack(Employee employee)
	{
		/*
		 * Before insertion in the queue we need to check certain things.
		 * like whether your queue is empty or whther your queue is full
		 */
		
		//Add always back par kar.
		if(queue.length == 0)
		{
			queue[0] = employee;
			tail++;
		}
		
		//WHat if your queue is full.
		/*
		 * Then in that case there are multiple approaches to handle this situation.
		 * like we can double our array size.
		 * and make a new copy.
		 * Once the back == size of queue, we need to resize the array.
		 */
		else if(tail == queue.length)
		{
			//Just simply double the new array.
			Employee newArray[] = new Employee[2 * queue.length];
			//Now we have to loop through the old array and 
			//insert everything from old array to new array
			for(int i =0; i < queue.length;i++)
			{
				newArray[i] = queue[i];
			}
			//Now you are just making your newArray as queue ( the older one)
			queue = newArray;
			//Now insert the new element on the tail.
			queue[tail] = employee;
			tail++;
		}
		
		else
		{
			queue[tail] = employee;
			tail++;
		}
	}
	
	public Employee removeFront()
	{
		/*BEfore removing the element from the queue, we need to check whether the queus
		is empty or not.
		Because if your queue is empty and still you are trying to remove
		any element , you should get an error message.
		*/
		if(tail==0)
		{
			System.out.println("Your QUEUE is empty");
		}
		return queue[front++];
	}
	
	public Employee peek()
	{
		//This method will simply return the current first element from the queue.
		//But we will not remove the front element.
		
		return queue[front];
	}
	
	public void printQueue()
	{
		for(int i = front; i < tail;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
	
	
}
