package job_coding;

import java.util.*;

public class LargestSubGrid 
{
	public static int largestSubGridFunc(int[][] matrix, int maxSum1)
	{
		int matrixLength = matrix.length;
		int k = 1;
		
		int maxSum = 0;
		
	    while(k <= matrixLength)
	    {
	    	// row number of first cell in  
	        // current sub-square of size k x k 
	        for (int i = 0; i < matrixLength-k+1; i++) 
	        { 
	              
	            // column of first cell in current  
	            // sub-square of size k x k 
	            for (int j = 0; j < matrixLength-k+1; j++) 
	            { 
	                  
	                // Calculate and print sum of  
	                // current sub-square 
	                int sum = 0; 
	                for (int p = i; p < k+i; p++)
	                {
	                    for (int q = j; q < k+j; q++)
	                    {
	                        sum += matrix[p][q]; 
	                    }
	                
	                }
	                
	                System.out.print(" " +sum+ " ");
	               // maxSum = Math.max(sum, maxSum);
	              
	                maxSum = Math.max(sum, maxSum);
	            } 
	            
	        } 
	        
	        if(maxSum > maxSum1)
	        {
	        	return k-1;
	        }
	        System.out.println("MaxSum for " +k +" level is is " +maxSum);
	        
	        k++;
	    }

		//System.out.println("The maximum sum for " +k+" * "+k +" is matrix sum is: " +maxSum);
		
		return k-1;
	}

	public static void main(String[] args) 
	{
		int[][] matrix = {
				{4,4,4,4},
				{2,2,2,2},
				{3,3,3,3},
				{1,1,1,1}
						};
		/*
		int[][] matrix = {
				{2,2,2},
				{3,3,3},
				{4,4,4}
						};
		int[][] matrix = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
						};
		*/
		//LargestSubGrid obj = new LargestSubGrid();
		System.out.println(largestSubGridFunc(matrix, 41));
	}

}
