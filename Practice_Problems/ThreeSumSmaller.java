package job_coding;

import java.util.*;

public class ThreeSumSmaller 
{
	
	public int threeSumSmaller(List<Integer> nums, int target) 
	{
        int length = nums.size(), cnt = 0;
        Collections.sort(nums);
        for (int i = 0; i < length - 2; i++)
        {
        	
        	int left = i+1;
        	int right = length - 1;
        	
        	while(left < right)
            {
                if (nums.get(i) + nums.get(left) + nums.get(right) <= target) 
                {
                    cnt += right - left; //all r in (l, r] will also satisfy the condition
                    left++;
                }
                 else
                 {
                	 right--;
                 }
            }
        }
        return cnt;
    }

	public static void main(String[] args) 
	{
		ThreeSumSmaller obj = new ThreeSumSmaller();
		List<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(6);
		System.out.println(obj.threeSumSmaller(mylist, 8));
	}

}
