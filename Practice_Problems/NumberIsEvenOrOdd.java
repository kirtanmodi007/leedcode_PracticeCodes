package job_coding;

import java.util.*;

public class NumberIsEvenOrOdd 
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("ENter user Input number: ");
		
		int userInput = obj.nextInt();
		
		if(userInput %2==0)
		{
			System.out.println("Number is Even");
		}
		
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
