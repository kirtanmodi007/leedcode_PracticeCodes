package job_coding;

import java.util.*;

public class TwoSumOptimized 
{
	
	
	//This method is not optimized and it takes O(n^2) time and requires O(n) time complexity.
	int[] twoSum(int[] nums, int target)
	{
		int[] myArray1 = new int[2];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i + 1; j < nums.length; j++)
			{
				if(nums[j] == target - nums[i])
				{
					myArray1[0] = i;
					myArray1[1] = j;
				}
			}
		}
		
		return myArray1;
	}
	
	//Optimized solution for same approach.
	int[] twoSumOptimized(int[] nums, int target)
	{
		int[] myArray2 = new int[2];
		
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		//Loop through your array
		for(int i = 0; i < nums.length; i++)
		{
			int difference = target - nums[i];
			
			if(myMap.containsKey(difference))
			{
				myArray2[0] = i;
				myArray2[1] = myMap.get(difference);
				return myArray2;
			}
			else
			{
				myMap.put(nums[i], i);
			}	
		}
		
		return myArray2;
	}

	public static void main(String[] args) 
	{
		int myArray[] = {3,2,5,4,3,6};
		
		int printArray[] = new int[2];
		
		TwoSumOptimized myObj = new TwoSumOptimized();
		
		printArray = myObj.twoSum(myArray, 9);
		
		for(int i = 0; i < printArray.length; i++)
		{
			System.out.println("Not Optimized Solution: " +printArray[i]);
		}
		
		int printArray2[] = new int[2];
		
		printArray2 = myObj.twoSumOptimized(myArray, 9);
		
		for(int j = 0; j < printArray2.length; j++)
		{
			System.out.println("Optimized Solution: " +printArray2[j]);
		}
	}

}
