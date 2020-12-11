/*
 * In this we will double the size of an array and copy all the elements 
   from old array into new one.
 */

package kirtanCodes;

public class DoubleSizeArray 
{
	public static void main(String args[])
	{
		//Creating an array of size 5
		int tempArray[] = new int[5];
		
		
		//For loop to insert values into array
		for(int i = 0; i < tempArray.length ; i++)
		{
			tempArray[i] = i + 10;			
		}
		
		System.out.println("The size of the old array is: "+tempArray.length);
		
		
		//For loop to print the array value
		for(int i = 0; i < tempArray.length; i++)
		{
			System.out.println("ELement at index" +" " +i +" " +"is" +" " +tempArray[i]);			
		}
		
		/*
		 * Now we are creating another array, and it will be of double the size of
		original array.args
		*/
		
		int doubleSizedArray[] = new int[tempArray.length * 2];
		
		System.out.println("The size of the newly created array is: "+doubleSizedArray.length);
		
		//Now we will copy all the elements from old array to new array
		for(int i = 0 ; i<tempArray.length ; i++)
		{
			/*
			 * So, we will copy all the values from index i of old array into new array.
			 */
			doubleSizedArray[i] = tempArray[i];
		}
		
		//Printing the new array
		
		for(int i = 0 ; i<doubleSizedArray.length ; i++)
		{
			System.out.println("ELement at index" +" " +i +" " +"is" +" " +doubleSizedArray[i]);
		}
		
	
		
		
		
		
	}
}
