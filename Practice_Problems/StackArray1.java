package kirtanCodes;

/*
 * This class is used to implement all the functionalities related to Stack.
 */
public class StackArray1 
{
	int top = -1;
	
	//Making an Array which will be used to implement Stack Functions.
	int[] myArray = new int[10];	//Array of size 10.
	
	public void push(int value)
	{
		if(top==-1)
		{
			top++;
			myArray[top] = value;
		}
		
		else
		{
			top++;
			myArray[top] = value;
		}
	}
	
	public void pop()
	{
		top--;
	}
	
	public void top()
	{if(top==-1)
	{
		System.out.println("There is nothing in Stack.");
	}
		System.out.println("The top value is Stack is: "+myArray[top]);
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		for(int i = 0; i<=top; i++)
		{
			System.out.println(myArray[i]);
		}
	}
	
	
}
