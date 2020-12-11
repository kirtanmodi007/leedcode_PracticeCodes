
/*
 * 88. Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
   one sorted array.

	Note:
	
	The number of elements initialized in nums1 and nums2 are m and n respectively.
	You may assume that nums1 has enough space (size that is greater or equal to m + n)
	to hold additional elements from nums2.
	
	Example:
	
	Input:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3
	
	Output: [1,2,2,3,5,6] 
*/

package kirtanCodes;

import java.util.Scanner;

public class MergingSortedArray 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		int[] array1 = new int[10];
		
		array1[0] = 1;
		array1[1] = 3;
		array1[2] = 5;
		array1[3] = 8;
		
		int[] array2 = {4,5,6};
		
		int length1 = array1.length;
		int length2 = array2.length;
		
		/*
		
		System.out.println(length1);
		System.out.println(length2);
		
		for(int i = 0; i<length1; i++)
		{
			System.out.println(array1[i]);
		}
		
		for(int i = 0; i<length2; i++)
		{
			System.out.println(array2[i]);
		}
		
		*/
		
		/*Now in orderto merge this 2 arrays, we will use another method/ function.*/
		/*
		 * We will make an object of this class to access the method.
		 */
		
		MergingSortedArray obj = new MergingSortedArray();
		
		obj.merge(array1,4,array2,length2);
		
	}
	
	/*
	 * This function contains actual Merging Logic.
	 */
	
	public void merge(int[] array1, int m, int[] array2, int n)
	{
		/*
		 * SInce, we already know that, capacity of Array1 is capable enough
		 * to hold all the elements of array 2.*/
/*		if(m<n)
		{
			for(int i = 0; i<m; i++)
			{
				System.out.println(nums1[i]);
			}
		}
*/
		
		/*
		 * m & n are currently present elements in both the array respectively
		 * */
		while(m > 0 && n > 0)
		{
			if(array1[m-1] > array2[n-1])
			{
				array1[m+n-1] = array1[m-1];
				m--;
			}
			
			else
			{
				array1[m+n-1] = array2[n-1];
				n--;
			}
		}
		
		while(n > 0)
		{
			array1[m+n-1] = array2[n-1];
			n--;
		}
		
		/*
		 * Printing the combined array
		*/
		
		for(int i =0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
	}

}
