package kirtanCodes;


//From util package (which contains different inbuilt classes), insert Scanner class.
import java.util.Scanner;
public class UserInput 
{
	public static void main(String[] args)
	{
		/*
		 * Here, we are taking user input. 
		 * For that we are using inbuilt Scanner class from java.
		 */
		//Here, we created "userInput" object of class Scanner.
		/*Now we will use all the inbuilt function of class Scanner with the help of
		its object*/
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number");
		
		/*So, with the help of userInput object we are calling nextInt function 
		from class Scanner. */
		int x = userInput.nextInt();	//Variable x will contain userInserted value.
		
		System.out.println("Your entered value is: " +x);
	}

}
