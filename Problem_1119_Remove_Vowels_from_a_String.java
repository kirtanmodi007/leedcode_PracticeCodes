Class Solution 
{
    public String removeVowels(String S) 
    {
    //Time Complexity = O(n)
    //Space Complexity = O(1)
    //We can solve this question using hashsset as well.
        String abc = "";
        
        if(S.length() == 0)
        {
            return "";
        }
        
        int count = 0;
        //1-1 character ma loop through kar jo AEIOU ne match kare to remove kar
        for(int i = 0; i < S.length(); i++)
        {
            char c = S.charAt(i);
            if(c == 'a')
            {
                count++;
            }
             else if(c == 'e')
            {
                count++;
            }
             else if(c == 'i')
            {
                count++;
            }
             else if(c == 'o')
            {
                count++;
            }
             else if(c == 'u')
            {
                count++;
            }
            else
            {
                abc = abc+c;
            }
        }
        
        return abc;
    }
}
