class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        //OVERALL TIME COMPLEXITY = 0(N)
        //OVERALL SPACECOMPLEXITY = O(N) BECAUSE WE ARE USING EXTRA HASHMAP AS WELL AS ARRAY.
        //SO ITS A SPACE HEAVY SOLUTION, MAY BE WE SHOULD THINK OF A BETTER SOLUTION
        
        
        String myArray[] = s.split(" ");
        
        if(myArray.length != pattern.length())
        {
            return false;
        }
        
        Map<Character, String> map = new HashMap<>();
        
        //If the length are same do the mapping
        for(int i = 0 ; i < myArray.length; i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(map.get(pattern.charAt(i)).equals(myArray[i]))
                   {
                       continue;
                   }
                 else
                   {
                       return false;
                   }
            }
            else
            {
                if(map.containsValue(myArray[i]))
                {
                    return false;
                }
                else
                {
                    map.put(pattern.charAt(i), myArray[i]);
                }    
            }
        }

        return true;
    }
}
