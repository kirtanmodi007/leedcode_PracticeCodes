class Solution 
{
    public int reverse(int x) 
    {
        //FIrst thing is to check whhether the input number is negative or noy.
        //If input number is negative then make it positive.
        
        boolean negative = false;
        if (x < 0)
        {
            negative = true;
            x = x * -1;
        }
        
        //So, now we have positive number
        
        long rev = 0;
        int modulo;
        while (x > 0)
        {
            modulo = x % 10;
            x = x / 10;
            rev = rev * 10 + modulo;
        }
        
        if(rev > Integer.MAX_VALUE)
        {
            return 0;
        }
        
        else if (negative)
        {
            return (int)(rev * -1);
        }
        
        else
        {
            return (int)rev;
        }
    }
}
