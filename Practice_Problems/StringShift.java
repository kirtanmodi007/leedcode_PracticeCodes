package job_coding;

public class StringShift 
{
	
	public String shift(String s)
	{
		s = s.substring(1,s.length())+s.charAt(0);
		return s;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//System.out.println("Hi");
		
		int counter = 0;
		
		String s = "abbcca";
		
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			counter++;
		}
		
		StringShift obj = new StringShift();
		
		for(int i = 0; i < s.length()-1; i++)
		{
			s = obj.shift(s);
			System.out.println(s);
			
			if(s.charAt(0)==s.charAt(s.length()-1))
			{
				counter++;
			}
		}

		System.out.println("The Counter is: "+counter);
	}

}
