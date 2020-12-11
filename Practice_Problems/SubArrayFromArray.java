package job_coding;

import java.util.*;

public class SubArrayFromArray {

	public static void main(String[] args) 
	{
		int myArray[] = {1,2,3,4};
		
		int i = 0;
		int j = 0;
		
		while(i<=j && j!=myArray.length)
		{
			int[] newArray[][] = Arrays.copyOfRange(myArray, i, j);
			System.out.println(newArray);
			j++;
		}	
	}
}
