package job_coding;

import java.util.*;

public class SubArraySumK 
{
	
	 public void subarraysDivByK(int[] A, int K) 
	    {
	     int count = 0;   
		 int result = 0;
		 for (int i = 0; i < A.length; i++) 
		 {
			 int sum = 0;
			 for (int j = i; j < A.length; j++) 
			 {
				 sum += A[j];
				 if(sum % K == 0)
				 {
					 count++;
				 }
				 result += sum;
				 System.out.println(sum);
			 }
			 
			 
		 }
		 
		 System.out.println(count);
		 System.out.println("HO");
		 
		 
	        //One approach is to make all the subarray from the given array. then in the end
	        //check which subarray's sum is divisible by 0. If yes increment your counter
	        //Return the counter in the end;
	        
	        //int front = 0;
		 /*
	        int end = 1;
	        
	        int[][] arrayOfArrays = new int[A.length][A.length * A.length];
	        
	        int j = 0;
	        
	        for(int i = 0; i < A.length; i++)
	        {
	        	
	            while(end!=(A.length+1))
	            {
	                arrayOfArrays[j] = Arrays.copyOfRange(A, i, end);
	                System.out.println(arrayOfArrays[j].length);
	    	        System.out.println(Arrays.deepToString(arrayOfArrays));
	                end++;
	                j++;
	            } 
	            
	            end = i + 1;
	            
	           // System.out.println(arrayOfArrays[j].length);

	            //front++;
	           // j = arrayOfArrays[j].length +1;
	            
	        }
	        

	        int sum=0;
	        for (int k=0; k<arrayOfArrays.length;k++)
	        {
	          for (int l=0;l<arrayOfArrays[l].length;l++)
	          {
	            sum+=arrayOfArrays[l][l];

	          }
	        }
	          System.out.println(sum);
	        
	        System.out.println(Arrays.deepToString(arrayOfArrays));
	        

	        
	    
	        //return A.length;
	        
	        */
	    }

	public static void main(String[] args) 
	{
		
		int myArray[] = {4,5,0,-2,-3,1};
		SubArraySumK myObj = new SubArraySumK();
		myObj.subarraysDivByK(myArray, 5);
		
	}

}
