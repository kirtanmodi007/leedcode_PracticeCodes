class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        //Firstly clone your array
        //Then sort the cloned array
        
        int myClonedArray[] = nums.clone();
        
        //sort the cloned array
        Arrays.sort(myClonedArray);
        
        int start = myClonedArray.length;
        int end = 0;
        
        for(int i = 0; i < myClonedArray.length; i++)
        {
            if(nums[i]!=myClonedArray[i])
            {
                start = Math.min(start, i);
                end = Math.max(end,i);
            }
        }
        
        return (end - start) >=0 ? end-start + 1 : 0;
        
    }
}
