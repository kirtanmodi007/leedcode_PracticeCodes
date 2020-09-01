class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        //KADANE's ALGORITHM (FOR FEASIBLE)
        
        //OVERALL TIME COMPLEXITY: O(n)
        //OVERALL SPACE COMPLEXITY: O(1)
        
        //Brute - FOrce approach's time complexity is O(n^2), using Kadane's algo we can reduce the time complexity to O(n).
        
        //Base-Cases
        if(nums.length < 1)
        {
            return 0;
        }
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        //Actual Logic
        
        int maxSum = Integer.MIN_VALUE;
        
        int contiguousSum = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            contiguousSum = Math.max(nums[i],contiguousSum + nums[i]);
            
            //Contiguous Sum ma pan je maxSum malyo hoy aenu tracking rakhwu pade.
            maxSum = Math.max(maxSum, contiguousSum);
        }
        return maxSum;
    }
}
