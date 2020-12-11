package job_coding;

public class abc 
{

	public static void main(String[] args) 
	{
		/*
		char ch = 'A';
		
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("true");
		}
		
		
		for(int i = 1; i <=100; i = i + 1)
		{
			if(i!=1)
			{
				System.out.println(i);
				i = i + 1;
			}
		}
		
		int x = 3;
		int i = 0;
		
		while(i < 3)
		{
			x += 1;
			i += 1;
		}
		
		System.out.println("The value of x after execution is: " +x);
		*/
		
		int j;
		for(j = 0; j <= 10; j++)
		{
			if(j==4)
			{
				System.out.println(j +" ");
				continue;
			}
			
			else if(j!=4)
			{
				System.out.println(j +" ");
			}
			
			else
			{
				break;
			}
		}
	}
}
