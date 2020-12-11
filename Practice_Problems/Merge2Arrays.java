package job_coding;

import java.util.Arrays;

public class Merge2Arrays 
{
	
	public void merge(int[] nums1, int length1, int[] nums2, int length2) 
    {
        
        //Time COmplexity - O(m+n) because we are iterating through both array.
        //Or time complexity = O(num1.length)
        //SPace Complexity = O(1) -> Constant.
        //Memory usage vadhare aawe 6e, because we are using variables to store lengths
        
		int mergeArray[] = new int[length1+length2];
		int index = length1 + length2 - 1;
        int a = length2 - 1;
        int b = length1 - 1;
        
       

        while(index >=0)
        {
            //Jo, 1st Array ma kai j initialize na karelu hoy, to simply
            //2nd array ma jetli vastuo 6e ae muki de
            if(b < 0)
            {
            	mergeArray[index] = nums2[a];
                a--;
            }
            
            //Now assume ke n < 0 6e, 
            //That means 1st array ma je 6e ae j barabar 6e.
            else if(a < 0)
            {
            	mergeArray[index] = nums1[b];
                b--;
            }
        
        //else simply means ke banne array ma kai k kaik values initialize kareli 6e
            else
            {
                if(nums2[a] > nums1[b])
                    {
                		mergeArray[index] = nums2[a];
                        a--;
                    }
                else
                	{
                		mergeArray[index] = nums1[b];
                		b--;
                	}
            }
            

            index--;
        }
        
        for(int i = 0 ; i < mergeArray.length; i++)
        {
        	System.out.println(mergeArray[i]);
        }
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Merge2Arrays myArray = new Merge2Arrays();
		
		int array1[] = {1,5,7,7};
		int array2[] = {0,1,2,3};
		
		myArray.merge(array1, array1.length, array2, array2.length);

	}

}
