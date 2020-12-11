package job_coding;

public class Factorial 
{
	
	public int factorial(int num)
	{
		if(num <=1)
		{
			return 1;
		}
		
		else
		{
			return num * factorial(num - 1);
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//This problem could be solve by recurssion
		

		Factorial myObj = new Factorial();
		int x = myObj.factorial(5);
		
		System.out.println(x);
	}

}
