package kirtanCodes;

public class MaxElementFromArray 
{
	public static void main(String args[])
	{
		int array1[] = {1,7,2,89,450,100,65,23,3};
		
		//Calling a function to find the maximum / largest value from this array.	
		int maximum_value = maxValue(array1);
		
		System.out.println("The largest element from array is: " +maximum_value);
	}
	
	/*Here, I have made maxValue function as Static Method, that's why I don't need 
	to create an object. */
	
	public static int maxValue(int array1[])
	{
		int max_value = array1[0];
		
		for(int i = 1; i<array1.length; i++)
		{
			if(array1[i] > max_value)
			{
				max_value = array1[i];
			}
		}
		
		return max_value;
	}

}
