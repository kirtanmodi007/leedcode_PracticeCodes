class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x < 0)
        {
            return false;
        }
        
        int reverseNumber = 0;
        int original = x;
        
        while(x > 0)
        {
            int modulo = x % 10;
            reverseNumber = reverseNumber * 10 + modulo;
            x = x / 10;
        }

        
        return original == reverseNumber;
    }
}
