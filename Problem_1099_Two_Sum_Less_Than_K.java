class Solution 
{
    public int twoSumLessThanK(int[] A, int K) 
    {
        //Jo array sorted hoy to to easily solve kari shakay,
        //but ahi arraay sorting ni time complexity = O(nlogn) thai jay.
        
        
        //BRUTE FORCE APPROACH
        //OVERALL TIME COMPLEXITY = O(NLOGN)
        //OVERALL SPACE COMPLEXITY = 0(1)
        //Sort the array and then do the binary search
        
        Arrays.sort(A);
        
        int low = 0;
        int high = A.length - 1;
        
        int maxSum = Integer.MIN_VALUE;
        
        while(low < high)
        {
            if(A[low] + A[high] >= K)
            {
                high--;
            }
            
            else if(A[low] + A[high] < K)
            {
                maxSum = Math.max(maxSum, A[low] + A[high]);
                low++;
            } 
        }

        //Have jo maxSum ni value j change na thai hoy to simply return -1.
        //Else return the maxSum we got.
        if(maxSum == Integer.MIN_VALUE)
        {
            return -1;
        }
        
        return maxSum;
    }
}
