class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        
        //Optimized Solution
        
         HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
        
        int myArray[] = new int[2];
        
        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];
            
            if(myHashMap.containsKey(difference))
            {
                myArray[0] = myHashMap.get(difference);
                myArray[1] = i;
                return myArray;
            }
            
            else
            {
                myHashMap.put(nums[i],i);
            }
        }
        
        return myArray;
        
        //Not opptimized Solution
        
        /*
        int[] indicesArray = new int[2];
        
        for(int i = 0; i <=nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    indicesArray[0] = i;
                    indicesArray[1] = j;
                    break;
                }
            }
               
        }
        
        return indicesArray;
        */
}
}
