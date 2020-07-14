class Solution 
{
    HashSet<Integer> mySet = new HashSet<Integer>();
    
    public boolean isHappy(int n) 
    {
        
        //This is recurrsion problem for sure.
        
        //Happy number simply means add the square of numbers till we get 1.
        //Firstly we have to put our numbers into array

        if(mySet.contains(n))
           {
               return false;
           }
        else if(n==1)
        {
            return true;
        }
        else
           {
               mySet.add(n);
           }
 
       // TILL THE DATE KAI VALUES AAPDE SEE KARI 6E, AENO HISAB RAKHWA MAKE A HASHSET
        //HASHSET ALWAYS CONTAINS UNIQUE VALUES.
            

        int sum = 0;
        while(n > 0)
        {
            int modulo = n % 10;
            sum = sum + modulo * modulo;
            n = n /10;
        }
        
        
        return isHappy(sum);
}
}
