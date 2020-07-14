class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        
        int length = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]!=val)
            {
                nums[length] = nums[i];
                length = length + 1;
            }
        }
        
        return length;
    }
}
