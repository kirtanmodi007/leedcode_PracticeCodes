/*
 * This class is used to implement ArrayList, ArrayList are used when you are not sure
about your Array Size. ArrayList = Dynamic Array 
*/

package kirtanCodes;

//Firstly we imported ArrayList class from util library.
//THen we created an object of that class to use its inbuilt functions.
import java.util.ArrayList;


public class ArrayListDemo 
{
	public static void main(String args[])
	{
		//In java we can directly use the ArrayList class from inbuilt Util Library.
		//Firstly import the class file from library
		
		//Now we can directly use ArrayList class by making its object
		//So, here we created an object of class ArrayList name myList.
		//It is of type Integer, that's why we wrote Integer. 
		//Here, we declared arraylist with initial size of 5.
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		
		/*Here, add is inbuilt function in ArrayList class. So we are using it 
		with the help of an Object.class */
		
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		/*
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		mylist.add(7);
		mylist.add(8);
		mylist.add(100);
		*/
		
		//Now in order to print all the elements of ArrayList, we can loop through them.
		

	for(int i = 0; i<mylist.size(); i++)
	{
		System.out.println(mylist.get(i));
	}
			
	System.out.println("THe current size is: " +mylist.size());
	
	mylist.set(2, 500);
	
	for(int i = 0; i<mylist.size(); i++)
	{
		System.out.println(mylist.get(i));
	}
	
	mylist.remove(1);
	System.out.println("AFter removal the new array is: ");
	
	for(int i = 0; i<mylist.size(); i++)
	{
		System.out.println(mylist.get(i));
	}
	
	System.out.println("New size of arraylist is: " +mylist.size());
	
		
		
		
	}

}
