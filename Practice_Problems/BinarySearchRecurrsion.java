package job_coding;

public class BinarySearchRecurrsion 
{
	
	//Time Complexity : O(logn)
	//Space Complexity: O(logn) //becuase to store all the recurrsion call
	//							we have to store this recurssion call in a stack.
	//							That's why at max we may utilize O(logn) space in Recurrsion.
	
	public int BinarySearchRecurrsionFunction(int array[], int target)
	{
		return BinarySearchRecurrsionFunctionIndex(array, target, 0, array.length - 1);
	}
	
	public int BinarySearchRecurrsionFunctionIndex(int array[], int target, int start, int end)
	{
		if(start > end)
		{
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(array[mid]==target)
		{
			return mid;
		}
		
		else if(target < array[mid])
		{
			return BinarySearchRecurrsionFunctionIndex(array, target, start, mid - 1);
		}
		
		else
		{
			return BinarySearchRecurrsionFunctionIndex(array, target, mid + 1, end);
		}
	}

	public static void main(String[] args) 
	{

		
		int myArray[] = {1,2,3,3,4,5,5,7,7,8,9};
		int target = 7;
		
		BinarySearchRecurrsion obj = new BinarySearchRecurrsion();
		System.out.println(obj.BinarySearchRecurrsionFunction(myArray, target));
	}

}
