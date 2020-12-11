package job_coding;

import java.util.*;

public class SingleNumber 
{
	
	public int singleNumber(int[] nums)
	{
		HashMap<Integer, Integer> myObj = new HashMap<Integer, Integer>();
		
		int values = 0;
		
		int myKey;
		
		for(int i =0; i < nums.length; i++)
		{
			if(myObj.containsKey(nums[i]))
			{
				values = values + 1;
				myObj.put(nums[i], values + 1);
			}
			
			else
			{
				myObj.put(nums[i], 1);
			}
		}
		
		  for (int i : nums) 
		  {
	            if (myObj.get(i)==1) 
	            {
	               	return i;
	               	//System.out.println(myKey);
	            }
	        
	        }
		  
		  return 0;
	}
	
	public static void main(String args[])
	{
		int nums[] = {4, 1, 4, 1, 2, 2};
		
		SingleNumber myObj = new SingleNumber();
		
		int value = myObj.singleNumber(nums);
		
		System.out.println("The unique value in Array is : " +value);
	}

}
