package job_coding;

public class TwoSmallestNumbersArray 
{
	public void twoSortedArray(int myArray[],int numbersOfElement)
	{
		int minNumber = myArray[0];
		
		for(int i = 0; i < myArray.length; i++)
		{
			for(int j = i+1; j < myArray.length; j++)
			{
				if(myArray[i] > myArray[j])
				{
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		for(int k = 0; k < numbersOfElement; k++)
		{
			System.out.println(myArray[k]);
		}
	}

	public static void main(String[] args) 
	{
		TwoSmallestNumbersArray obj = new TwoSmallestNumbersArray();
		
		int myArray[] = {4,2,3,5,1,6,7,8,4};
		
		obj.twoSortedArray(myArray,2);

	}

}
