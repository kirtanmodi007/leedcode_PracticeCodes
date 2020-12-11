package job_coding;

//This class will contain all the functions related to STACK implementation.

//Main class for this class is into "StackArray.java file"

//HERE, WE ARE IMPLEMENTING STACK USING ARRAY.
//IN, STACK INSERTION ALWAYS HAPPENS FROM TOP.

public class StackArrayImplementation 
{
	//Making an array of some arbitary size.
	
	int[] myStack = new int[10];
	
	//Initially your top reference to index 0, which means no where.
	int top = -1;
	
	public void push(int x)
	{
		/*
		 * Before inserting any element into the stack, we have to make sure about the size
		 * of STACK.
		 * If stack is full then we have to double the size of Array and then insert the value.
		 * Or, we can simply prevent insertion operation if we don't want to increase the 
		 * stack size.
		 */
		
		if(top >= myStack.length - 1)
		{
			//Firstly make a new array of double the size of previous one.
			//Then copy all the elements from older STACK / Array to new.
			int[] myDoubleSizeArray = new int[myStack.length * 2];
			
			//Copy all the elemetns from old array to new array
			for(int i = 0; i <myStack.length; i++)
			{
				myDoubleSizeArray[i] = myStack[i];
			}
			
			myStack = myDoubleSizeArray;
			top = top +1;
			myStack[top] = x;
		}
		
		//If the stack is not full then we can simply add all the elements.
		else
		{
			top = top +1;
			//In stack insertion always happens at top.
			myStack[top] = x;
		}
			
	}
	
	public void pop()
	{
		System.out.println(myStack[top]);
		top = top - 1;
	}
	
	public void peek()
	{
		System.out.println(myStack[top]);
	}
	
	public void display()
	{
		//Print always LIFO order ma j karaway, as this is stack.
		
		for(int i = top; i >=0; i--)
		{
			System.out.println(myStack[i]);
		}
	}
	
}
