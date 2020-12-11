package job_coding;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) 
	{		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        
        //We can itereate over a LIST by using ENHANCE FOR LOOP.
        /*
        for(Employee e: employeeList)
        {
        	System.out.println(e);
        }
        
        //We can iterate over a List USING LAMBDA FUNCTION AS WELL/
        employeeList.forEach((employee) -> System.out.println(employee));
        
        //Here, we are converting the LIST into AN ARRAY AND THEN PRINTING IT.
       	System.out.println(Arrays.toString(employeeList.toArray()));
        
       	//Just like array's we can access all the elements of ArrayList using the indexes.
       	System.out.println(employeeList.get(2));
       	
       	//To access any elements from the ArrayList can happen in CONSTANT TIME. O(1).
       	//Irrespective of the size of ArrayList.
       	
       	//WHile if you create a LinkedList, then to access any particular element
       	//will take O(n) time in worst case scenario.
       	
       	//Code to check whther the List is Empty or Not.
       	System.out.println(employeeList.isEmpty());
       	
       	//To remove elements from the ArrayList
       	System.out.println(employeeList.remove(2));
       	
       	//Replace value in Place can be done in ArrayList as well.
       	//employeeList.set(2, new Employee("Kirtan", "Modi", 1401122));
       	
       	//To get the size of the LIST
       	System.out.printf("%d", employeeList.size());
       	*/
       	
       	//We can convert our LIST into An ARRAY.
       	//As we want to hold EMployee type of datda, I am gonna make an array of Employee type
       	
       	Employee myArray[] = new Employee[employeeList.size()];
       	
       //Now just convert your list into an Array, using inbuilt Method.
       	employeeList.toArray(myArray);
       	
       	//So, now we have our LIST INSIDE AN ARRAY.
       	
       	for(int i =0; i < myArray.length; i++)
       	{
       		System.out.println(myArray[i]);
       	}
       	
       	
	}

}
