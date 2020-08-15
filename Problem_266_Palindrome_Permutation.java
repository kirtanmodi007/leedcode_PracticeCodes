class Solution 
{
    public boolean canPermutePalindrome(String s) 
    {
        //Jo badhi keys ni value 2 male and 1 key ni value 1 male to yes we can.
        
        //Create HashMap
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i < s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int count = 0;
        //Badha character mate ni value nu modulo jo 2 aawe to that means ke ae character even number of times aawe 6e.
        //Jo badha even j male to to count 0 j mashe.
        //Pan jo 1 thi vadhare character mate count no modulo 1 male to overall count 1 thi moto male.
        //So aapde return karwathi vakhte check kariye 6e ke jo count <=1 hoy to return true else false.
        for(char k:map.keySet())
        {
             count += map.get(k) % 2;          
        }
        
        return count <=1;
    }
}
