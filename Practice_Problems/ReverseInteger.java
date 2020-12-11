package job_coding;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		int myNumber = 546;
		
		int reverseNumber = 0;
				
		while(myNumber > 0)
		{
			int tempNumber = myNumber % 10;
			myNumber = myNumber / 10;
			reverseNumber = reverseNumber*10 + tempNumber;
		}
		System.out.println("The reversed number is: " +reverseNumber);

	}

}
