class Solution 
{
    public boolean isPalindrome(int x) 
    {
    /*
      We can solve this question in multiple ways.
      option 1: using the stack approach. put everything into stack, pop everything and check if both the numbers are same or not.
      option 2: we can use two pointers approach. Convert int to string and just compare the start index and end index values.
      option 3: we can reverse the whole number and just compare it with our input number.
      
      
      Here, I am using the 2 pointers approach (option 2)
    */
        
        //OVERALL TIME COMPLEXITY = O(N)
        //OVERALL SPACE COMPLEXITY = O(1) CONSTANT SPACE NO EXTRA SPACE USED
        
        //Approach - 1 2 Pointers
        
        if(x < 0)
        {
            return false;
        }
        
        
        //STEP = 1 Convert the Number into a String
        String currentString = String.valueOf(x);
        
        int left = 0;
        int right = currentString.length() - 1;
        
        while(left < right)
        {
            if(currentString.charAt(left) != currentString.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        
        return true;
        
    }
}
