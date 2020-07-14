import java.util.*;

class Solution
{
    public int maxProfit(int[] prices)
    {
        //Always tari buying price ae selling price thi o6i howi joi ae.
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int index = 0;
        int max_Profit = 0;
        
        for(int i =0; i < prices.length; i++)
        {
            if(prices[i] < min1)
            {
                min1 = prices[i];
                index++;
            }
        }
        
        if(prices.length == index)
        {
            return 0;
        }
        

        else
        {
            for(int i =0; i < prices.length; i++)
            {
                if(prices[i] < min2)
                {
                    min2 = prices[i];
                    //max_Profit = prices[i+1] - prices[i];
                }
                
                else if((prices[i] - min2) > max_Profit)
                {
                    max_Profit = prices[i] - min2;
                }
            }
        }
        
        
        
        return max_Profit;
        
    }
}
