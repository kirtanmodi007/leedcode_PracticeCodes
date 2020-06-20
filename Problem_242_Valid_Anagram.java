class Solution 
{
    /*
    This problem could be solved with HashTable, where we can count the frequency of each letter For that we have to create 2 Hash Maps, if both have same number of frequency of each letter then 
    */
    public boolean isAnagram(String s, String t) 
    {
        if (s.length() == t.length())
        {
            Map<Character, Integer> myhashobj1 = new HashMap<Character, Integer>();
            Map<Character, Integer> myhashobj2 = new HashMap<Character, Integer>();
            
            char[] myCharArr1 = s.toCharArray();
            char[] myCharArr2 = t.toCharArray();
            
            for(char i:myCharArr1)
            {
                Integer j = myhashobj1.get(i); 
                
                if(j == null)
                {
                    myhashobj1.put(i,1);
                }
                
                else
                {
                    myhashobj1.put(i, j+1);
                }
            }
            
            for(char i:myCharArr2)
            {
                Integer j = myhashobj2.get(i); 
                
                if(j == null)
                {
                    myhashobj2.put(i,1);
                }
                
                else
                {
                    myhashobj2.put(i, j+1);
                }
            }
            
            //System.out.println(myhashobj1);
            //System.out.println(myhashobj2);
            
            
            if(myhashobj1.equals(myhashobj2))
            {
                return true;
            }
            
            else
            {
                return false;
            }
            
            
        }
        
        else
        {
            return false;
        }
    }
}
