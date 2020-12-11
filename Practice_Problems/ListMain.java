package kirtanCodes;

import java.util.ArrayList;

import java.util.List;

public class ListMain 
{
	public static void main(String[] args)
	{
		//HEre, we are creating an object of class List and it is of type Employee.
		List<Employee> employeeObject = new ArrayList<>();
		employeeObject.add(new Employee("Kirtan", "Modi", 007));
		employeeObject.add(new Employee("Komal", "Modi", 017));
		employeeObject.add(new Employee("Shahrukh", "Khan", 002));
		employeeObject.add(new Employee("XYZ", "Patel", 000));
		employeeObject.add(new Employee("dada", "asl", 107));
		
		
		
		for(Employee x:employeeObject )
		{
			System.out.println(x);
			
		}
		
		System.out.println("The current size of ArrayList is: " +employeeObject.size());
		
		
		
	}

}
