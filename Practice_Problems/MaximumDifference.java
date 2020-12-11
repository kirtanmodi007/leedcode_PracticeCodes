package job_coding;

public class MaximumDifference
{
	
	public int maxDifference(int A[])
	{
		
		int diff = Integer.MIN_VALUE;
		int n = A.length;
		int max_so_far = A[n-1];

		// traverse the array from right and keep track the maximum element
		for (int i = n - 2; i >= 0; i--)
		{
			// update max if current element is greater than the max element
			if (A[i] > max_so_far) {
				max_so_far = A[i];
			}
			// if the current element is less than the maximum element,
			// then update the difference if required
			else {
				diff = Integer.max(diff, max_so_far - A[i]);
			}
		}

		// return difference
		return diff;
		
		/*
		int maxDifference = -1;
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		int index = 0;
		
		//FIrst for loop fervi ne sauthi nano number and aeno index store karai de
		//Second for loop ae ith index pa6i j start thavu joi ae.
		//Awwi rite 2 var for loop ferwwathi min and max number mali jase
		//Just return their difference.
		
		//First for loop to get the Max number;
		
		
		for(int i = 0; i < myArray.length; i++)
		{
			if(myArray[i] > maxNumber)
			{
				maxNumber = myArray[i];
				index = i;
			}
		}
		
		System.out.println("Max number is: " +maxNumber);
		System.out.println("Max number index is: " +index);
		
		for(int j = 0; j < index; j++)
		{
			if(myArray[j] < minNumber)
			{
				minNumber = myArray[j];
			}			
		}
		
		System.out.println("Min number is: " +minNumber);

		return maxNumber - minNumber;
		*/
	}

	public static void main(String[] args) 
	{
		MaximumDifference obj = new MaximumDifference();
		
		int myArray[] = {3,3,7,1,4,6,1};
		System.out.println("The max difference is: " +obj.maxDifference(myArray));

	}

}
