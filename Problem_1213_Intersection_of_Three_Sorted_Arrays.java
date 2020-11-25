class Solution 
{
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) 
    {
        //OVERALL TIME COMPLEXITY = O(N)
        //OVERALL SPACE COMPLEXITY = 0(1) NOT USING ANY EXTRA DATA STRUCTURE
        //We need to implement a three pointer solution for sure.
        
        int index = 0;
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < arr1.length && j < arr2.length && k < arr3.length)
        {
            //Jewo tu lowest index wada ni bahar fenkai jay have kai counting ni jarur j nathi.
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
            {
                list.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            //3 aema jo element same na hoy to add to nahi j thay. but counter increment karwa pade.
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if(arr2[j] < arr3[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        return list;
    }
}
