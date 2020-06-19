class Solution 
{
    public boolean isPalindrome(String s) 
    {
        if(s.isEmpty())
        {
            return true;
        }
        
        else if(!s.isEmpty())
        {
            //First step is to replace all the spaces with no spaces.
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            
            //Now make the whole string as lower case.
            s= s.toLowerCase();
                                  
            for(int i = 0; i <s.length() / 2; i++)
            {
            	if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            	{
            		return false;
            	}

            }
        }
        
        return true;
    }
}
