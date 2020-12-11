package job_coding;

import java.util.Arrays;

public class BinarySearchIterative 
{
	//TIME COMPLEXITY: O(logn)
	//SPACE COMPLEXITY : O(1) -> Because we are not using any extra Data Structure
	//							to store values.
	
	public int BinarySearchIterativeFunction(int myArray[], int target)
	{
		//We have to return the indice of the given element.
		
		int low = 0;
		int high = myArray.length - 1;
		
		while(low <= high)
		{
			
			//In java left + right sum can overflow in INT DATA TYPE.
			//SO, in order to avoid overflow, we have to add left in below equation
			int mid = (low + high) / 2;
			
			if(myArray[mid] == target)
			{
				return mid;
			}
			
			//LEFT side search kar
			else if(target < myArray[mid])
			{
				high = mid - 1;
			}
			
			//Search of the right sub portion of the array
			else
			{
				low = mid + 1;
			}
		}
		
		//This simply means ke jo aakhu loop farya pa6i pan Target element na male to return
		//    -1 / false.
		return -1;
		
	}

	public static void main(String[] args) 
	{
		int myArray[] = {1,2,3,3,4,5,5,7,7,8,9};
		int target = 7;
		
		//Arrays.sort(myArray); //Sorted Array: [1,2,3,3,4,5,5,7,7,8,9]
		
		BinarySearchIterative obj = new BinarySearchIterative();
		
		int targetIndex = obj.BinarySearchIterativeFunction(myArray, target);
		
		System.out.println("The given target element is found at this index " +targetIndex);
		
	}

}
