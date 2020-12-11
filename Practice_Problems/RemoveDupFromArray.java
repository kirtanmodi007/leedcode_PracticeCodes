/*
 * 26. Remove Duplicates from Sorted Array
 * 
 * Given a sorted array nums, remove the duplicates in-place such that each 
 * element appear only once and return the new length.

	Do not allocate extra space for another array, you must do this by
	modifying the input array in-place with O(1) extra memory.
	
	Example 1:
	
	Given nums = [1,1,2],
	
	Your function should return length = 2, with the first two elements 
	of nums being 1 and 2 respectively.
	
	It doesn't matter what you leave beyond the returned length.
	Example 2:
	
	Given nums = [0,0,1,1,1,2,2,3,3,4],
	
	Your function should return length = 5, with the first five elements of nums
	being modified to 0, 1, 2, 3, and 4 respectively.
	
	It doesn't matter what values are set beyond the returned length.
 */

package kirtanCodes;

import java.util.*;

public class RemoveDupFromArray 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the sorted array");
		
		int[] inputArray = new int[10];
		
		for(int i = 0; i<inputArray.length; i++)
		{
			inputArray[i] = userInput.nextInt(); 
		}
		
		//Creating object of the same class
		RemoveDupFromArray obj = new RemoveDupFromArray();
		int length = obj.lengthReturn(inputArray);
		
		System.out.println("After removing the repeated elements, actual array length is: " +length);
		
	}
	
	public int lengthReturn(int[] inputArray)
	{
		int Finallength=1;
		
		for(int i =0; i<inputArray.length-1; i++)
		{
			if(inputArray[i] != inputArray[i+1])
			{
				inputArray[Finallength++] = inputArray[i+1];
			}
		}
		
		return Finallength;
	}

}
