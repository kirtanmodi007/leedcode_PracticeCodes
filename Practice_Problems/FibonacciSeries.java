package job_coding;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		//Recurssion thi solve karwu is a one approach
		
		int prevNumber = 0;
		int currentNumber = 1;
		
		while(currentNumber < 100)
		{
			int nextNumber = prevNumber + currentNumber;
			System.out.println(nextNumber);
			
			prevNumber = currentNumber;
			currentNumber = nextNumber;
		}
	}

}
