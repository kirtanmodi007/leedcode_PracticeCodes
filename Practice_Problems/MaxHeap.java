package job_coding;

//This MAX HEAP will be BACKED BY AN ARRAY.
public class MaxHeap 
{
	//We need only 2 things for HEAP.
	//	1. Array
	//	2. Index of the element to the array.
	//So, every time you put one element into Array. 
	//You have to make sure that you are increasing the current counter.
	
	private int heap[];
	private int heapSize;
	
	//SO, whenever the object is created of MaxHeap class.
	//We will get the size of Heap(Backed by array) in our constructor.
	MaxHeap(int capacity)
	{
		heap = new int[capacity];
	}
	
	//function to check whether your HEAP is Full or not.
	public boolean isFull()
	{
		//if jo tara heapSize variable ni value Array ni length jetli thai jay
		//That means ke taro array have full 6e.
		//You cannot add element inside your Heap.
		return heapSize == heap.length;
	}
	
	//Function to get your parent's index
	public int parentIndex(int index)
	{
		//By doing this we will get the parent index of ith index element.
		return (index - 1) / 2;
	}
	
	/*
	 * When we insert anything into the array. we always insert it after the lastly added 
	 * element. But before insertion we need to call isFull() method,
	 * to make sure that our Heap / array is not full.
	 */
	public void insert(int value)
	{
		//Insertion pahela check whether array is full or not.
		if(isFull())
		{
			/*
			 * This simply means if our array is full
			 * we have to either double our array size or throw an exception.
			 * Currently we are not doubling the size, we are just throwing EXCEPTION.
			 */
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		
		/*
		 * If your heap is not full, simply put it after, the previously inserted element.
		 */
		heap[heapSize] = value;
		
		/*
		 * After inserting at the first available index.
		 * we have to HEAPIFY OUR HEAP
		 * Since we are implementing MAX HEAP, we have to HEAPIFY accordingly.
		 */
		/*
		 * Since, this is MAX - HEAP. We have check whether the newly added item
		 * is greater then its parent or not.
		 * If it is greater then its parent then we have to swap all those value.
		 * We have to SWAP till our Parent Node is greater or we reach the root element.
		 * We have to store when either of the above mention conditions become true.
		 */
		fixHeapAbove(heapSize);
		
		heapSize++;
		
	}
	
	/*
	 * We are making the fixHeapAbove method private, becuase we don't want
	 * other people to access this method directly.
	 */
	
	//Here, the index is of just added value's index.
	private void fixHeapAbove(int index)
	{
		//Just get the newly valued element.
		int newlyAddedValue = heap[index];
		
		//Now we have to compare this value with its parent node.
		//We have to make our comparison till we reach the ROOT element
		//or till our parent node's value is smaller then newly inserted element.
		while(index > 0 && (newlyAddedValue > heap[parentIndex(index)]))
		{
			//Just assign the newlyAdded value its parent value.
			//Here, we are not directly assigning the newlyAddedValue to its parent node
			//Because we wanted to check that value with its Parent node as well.
			//So this for loop will simply take care of the WHOLE HEAPIFY PROCESS.
			heap[index] = heap[parentIndex(index)];
			//Now te je node ne parent node banayo, aeno index taro have 
			//current node no index banshe.
			index = parentIndex(index);
		}
		
		heap[index] = newlyAddedValue;
	}
	
	/*
	 * Now before deleting any value from the HEAP.
	 * We need to check whether the HEAP is empty or not.
	 * If the heap is empty, we cannot remove anything.
	 */
	
	public boolean isEmpty()
	{
		//If your HEAPSIZE is 0, then simply your HEAP is empty and you cannot delete
		//anything from the HEAP.
		return heapSize == 0;
	}
	
	/*
	 * Now in order to HEAPIFY DOWNWORDS (AS A PART OF DELETATION PROCESS.
	 * We need to know current index's elements child elements values.
	 */
	
	public int leftChild(int index)
	{
		return 2*index +1;
	}
	
	public int rightChild(int index)
	{
		return 2*index +2;
	}
	
	/*
	 * NORMALLY TU HEAP MATHI ROOT ELEMENT j remove karish,.
	 * So most cases ma to index pan pass karwani jaroor nathi.
	 */
	
	public int deleteRootElement()
	{
		int temp = heap[0];
		heap[0] = heap[heapSize-1];
		
		/*
		 * no we need to do the DOWN HEAPIFY PROCESS
		 */
		fixDownHeapify(0);
		
		heapSize--;
		
		return temp;
	}
	
	private void fixDownHeapify(int index)
	{
		/*
		 * now you have to check whether you have to traverse the left subportion
		 * or the right subportion
		 */
		
		
	}

}
