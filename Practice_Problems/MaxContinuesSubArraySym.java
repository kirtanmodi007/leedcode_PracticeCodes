package job_coding;

public class MaxContinuesSubArraySym 
{
	
	public int maxSubArray(int[] nums) 
    {
        //Approach - 1 (Brute - Force)
        //TIme COmplexity = O(n^3)
        //SPace COmplexity = O(1)
        //Since, it is O(n^3), the solution is going to be TIME LIMIT EXCEEDED.
        int maxSubArraySum = Integer.MIN_VALUE;;
        
        for(int left = 0; left < nums.length; left++)
        {
            for(int right = left; right < nums.length; right++)
            {
                int windowSum = 0;
                
                for(int i = left; i <=right; i++)
                {
                    windowSum = windowSum + nums[i];
                }
                
                maxSubArraySum = Math.max(windowSum, maxSubArraySum);
            }
        }
        
        return maxSubArraySum;
        
    }

	public static void main(String[] args) 
	{
		MaxContinuesSubArraySym myObj = new MaxContinuesSubArraySym();
		int myArray[] = {-57,9,-72,-72,-62,45,-97,24,-39,35,-82,-4,-63,1,-93,42,44,1,-75,-25,-87,-16,9,-59,20,5,-95,-41,4,-30,47,46,78,52,74,93,-3,5};
		System.out.println(myObj.maxSubArray(myArray));
	}

}
