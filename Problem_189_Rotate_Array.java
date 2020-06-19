class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        
        //FIrst function call is to reverse the whole list
        reverse(nums, 0, nums.length - 1);
        
        //Second function call is to reverse first k number
        reverse(nums, 0, k-1);
        
        //Third function call is to reverse the other n - k numbers
        reverse(nums, k, nums.length - 1);
    }
    
    public void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
