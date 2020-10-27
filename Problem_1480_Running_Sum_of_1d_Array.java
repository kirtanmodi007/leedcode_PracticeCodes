class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        /*
        If we are not facing overflow issue then we can solve this question easily in 
        o(n) time and o(1) space complexity.
        */
        
        //OVERALL TIME COMPLEXITY = O(N) BECAUSE WE ARE LOOPING ONCE
        //OVERALL SPACE COMPLEXITY = O(1) IF WE IGNORE THE OUTPUT ARRAY.
        
        //This solution does work thourh.
        
        int myArray[] = new int[nums.length];
        
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            sum+=nums[i];
            myArray[i] = sum;
        }
        
        return myArray;
    }
}
