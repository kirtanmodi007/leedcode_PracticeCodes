package kirtanCodes;

//This is a program of List using Array 

import java.util.*;
import java.lang.*;

class Array                                                          //This is main class
{
public static void main(String args[])                             //This is a method method
  {
   Process p = new Process();                                      //Here we have made an object of class Array
   
	 Scanner input = new Scanner(System.in);
	 
	 boolean exit = false;
    do
	    {
	     System.out.println("\nPress 1 to Insert Number from First Position");
	     System.out.println("Press 2 to Insert Number from Last Position");
	     System.out.println("Press 3 to Insert Number from Any Position");
	     System.out.println("Press 4 to Delete Number from First Position");
	     System.out.println("Press 5 to Delete Number from Last Position");
	     System.out.println("Press 6 to Delete Number from Any Position");
	     System.out.println("Press 7 to Search Number by it's Value");
	     System.out.println("press 8 to Search Number by it's Position");
		 System.out.println("press 9 to Sort Numbers");
		 System.out.println("press 10 to Display Numbers");
		 System.out.println("press 0 to Exit\n");
	  
	     int choice = input.nextInt();
	  
	     switch(choice)
	     {
	       case 1:
		   p.InsertFirst();
		   break;
		 
		   case 2:
		   p.InsertLast();
		   break;
		 
		   case 3:
		   p.InsertAtPosition();
		   break;
		 
		   case 4:
		   p.DeleteFirst();
		   break;
		 
		   case 5:
		   p.DeleteLast();
		   break;
		 
		   case 6:
		   p.DeleteAtPosition();
		   break;
		 
		   case 7:
		   p.SearchByValue();
		   break;
		 
		   case 8:
		   p.SearchByPosition();
		   break;
		 
		   case 9:
		   p.Sort();
		   break;
		 
		   case 10:
		   p.Display();
		   break;
		 
		   case 0:
		   exit=true;
		   break;
	     }
      }
         while(!exit);
	}
}

class Process                                           //This is the class which contains all the methods which we are going to use in our program	
{
 Scanner input = new Scanner(System.in);
 int array[] = new int[50];
 int value;
 int a=0;
 int i,k,min,n;
 		
  public void InsertFirst()                           //Method to Insert number at First Position
    {
		  System.out.println("Enter the value at 1st position:");
		  int value = input.nextInt();
		  
		  for(i=a;i>=0;i--)
			{
				array[i+1]=array[i];
			}
				array[0]=value;
				a++;
	  }		
	  
	public void InsertLast()                            //Method to Insert number at Last Position
    {
      System.out.println("Enter value that you want to add at last position:");
		int value = input.nextInt();
		array[a+1] = value;
	    a++;
	  }

  public void InsertAtPosition()                      //Method to Insert number at Any Position
    {
      System.out.println("Enter the position that in which you want to add your number: ");
		int n = input.nextInt();
		System.out.println("Enter your number that you want to add : ");
		int value = input.nextInt();
				for(i=a;i>=n;i--)
				{
				   	array[i+1]=array[i];	
				}
				array[n]= value;
				a++;
    }

  public void DeleteFirst()                           //Method to Delete number from First Position
    {
      a--;
		for(i=0;i<=a;i++)
			{
				array[i] = array[i+1];
			}
    }

	public void DeleteLast()                            //Method to Delete number from Last Position
    {
      a--;
    }

	public void DeleteAtPosition()                      //Method to Delete number from Any Position
    {
      System.out.println("Enter the position that from which you want to delete your number: ");
		int n = input.nextInt();
		a--;
			for(i=n;i<=a;i++)
				{
					array[i] = array[i+1];
				}
    }  
 
  public void SearchByValue()                         //Method to Search number by it's value
    {
      System.out.println("Enter your number that you want to search in index: ");
		int n = input.nextInt();
				for(i=0;i<=a;i++)
				{
					if(array[i]== n)
					{
						System.out.println("Your Search number's position = "+i);
					}
				}
    }

  public void SearchByPosition()                      //Method to Search number by Position
    {
      System.out.println("Enter the position number that you want to search : ");
		int n = input.nextInt();
				
			if(n>a)
			{
   			System.out.println("Sorry you had gone above the index limit !!!!!!!");
			}
				
			else 
				System.out.println("Your search's position value = " +array[n]);
    }

  public void Sort()                                  //Method to Sort Numbers
    {
       min = array[0];
					for(i=0;i<=a;i++)
					{
						for(k=0;k<=a;k++)
						{
							if(array[k]<array[i] && k>i)
							{	
								min=array[k];
								array[k] = array[i];
								array[i] = min;								
							}
						}
					}
					for(i=a;i>=0;i--)
					{
						System.out.println(array[i]);
					}
    }

  public void Display()                               //Method to Display numbers
    {
		    System.out.println("The outputs are as below");
			for(i=0;i<=a;i++)
				{
					System.out.println(array[i]);
				}
      	  
    }
}
