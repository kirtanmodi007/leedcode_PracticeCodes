package job_coding;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		//int a = 123451234512345;
		//System.out.println(a);
		
		for(int i =0; i <10; i++)
		{
			i+=1;
			System.out.println("ENter user Inputqwq: ");
		}
		
		
		System.out.println("ENter user Input number: ");
		
		int userInput = obj.nextInt();
		
		String s = "strawberries";
		
		System.out.println(s.substring(2,5));
		
		System.out.println("ENter the string: ");
		//String s = obj.next();
		
		System.out.println(s);
		
		boolean myVar = true;
		
		
		for(int i = 2; i < 100; i++)
		{
			if(userInput % i == 0)
			{
				myVar = false;
			}
		}
	}
}
