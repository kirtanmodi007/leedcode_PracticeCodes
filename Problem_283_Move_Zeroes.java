class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        
        int indexCount = 0;
        
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[indexCount] = nums[i];
                indexCount++;
            }   
        }
        
        for(int j = indexCount; j < nums.length; j++)
        {
            nums[j] = 0;
        }
        
        
        
        
        /*
        
        int temp[] = new int[nums.length];
        
        for(int i =0; i < nums.length-1; i++)
        {
            if(nums[i] == 0 && nums[i+1] !=0)
            {
                int temp1= nums[i+1];
                nums[i+1] = 0;
                nums[i] = temp1;
            }
            if(nums[i] == 0 && nums[i+1] == 0)
            {
                temp[i] = 0;
                temp[i+1] = 0;
                i = i +1;
            }
        }
        
        for(int j = temp.length - 1; j>=0; j--)
        {
            nums[nums.length-1] = temp[j];
        }
        
        
        for(int i =0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
        */
        
    }
}
