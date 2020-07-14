class Solution 
{
    public int rob(int[] nums)
    {
        //You go with the base case.
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }
        
        else if(nums.length == 1)
        {
            return nums[0];
        }
        
        else if(nums.length == 2)
        {
            //2 house mathi jema vadhare value hoy ae mokal.
            return Math.max(nums[0], nums[1]);
        }
        
        //Now we have to think about the bigger picture
        //So, now we are going to make a DYNAMIC PROGRAMMING ARRAY
        //which will have the maximum amount till the ith element
        
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        //3rd house mate tu shu jowe ke 1 + 3 no sum > 2nd no sum 6e
        
        
        for(int i = 2; i < nums.length; i++)
        {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);   
        }
        
        //dp array na last index par tari max value hoy, that's why we are returning it.
         return dp[nums.length-1];
        /*
         int max_Robbery1 = Integer.MIN_VALUE;
         int max_Robbery2 = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length-1; i = i + 2)
        {
            max_Robbery1 = nums[i] + nums[i+2];
        }
        
         for(int i = 1 ; i < nums.length; i = i + 2)
        {
            max_Robbery2 = nums[i] + nums[i+2];
        }
        
        if(max_Robbery1 > max_Robbery2)
        {
            return max_Robbery1; 
        }
        
        return max_Robbery2;
        
        */
        
        
    }
}
