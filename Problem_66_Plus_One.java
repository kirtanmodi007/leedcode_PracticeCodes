class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        
        for(int i = digits.length - 1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            //This simply means you have 999 as a value , then set all those values to 0.
            if(digits[i]==9)
            {
                digits[i] = 0;
            }
        }
        
        //As we have all the 0 in our digits array, we have to create
        //a new array which will have size = oldsieze + 1;
        //the first value will be 1.
        
        //By default all the values in the Array will be 0.
        int newArray[] = new int[digits.length+1];
        newArray[0] = 1;
        return newArray;
        
        //Belowed code work for small integer values only.
        
        /*
        String abc= "";
        for(int i =0; i < digits.length; i++)
        {
            abc = abc+digits[i];
        }
        
        System.out.println(abc);
        
        int myNumber = Integer.parseInt(abc);
        
        int output = myNumber + 1;
        
        int[] newArray = new int[(int)(Math.log10(output)+1)];
        int index = newArray.length-1;
        
        System.out.println(output);
        
        int i = 0;
        while(output > 0)
        {
            newArray[index] = output % 10;
            output = output / 10;
            index--;
        }
        
        for(int j =0; j < newArray.length; j++)
        {
            System.out.println(newArray[j]);
        }
        
        
        return newArray;
        */
        
    }
}
