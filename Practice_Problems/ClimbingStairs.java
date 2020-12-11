/*
 * PROBLEM: 70. Climbing Stairs
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.

	Each time you can either climb 1 or 2 steps. In how many distinct ways 
	can you climb to the top?
	
	Note: Given n will be a positive integer.
	
	Example 1:
	
	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
	Example 2:
	
	Input: 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step
 */


package kirtanCodes;

import java.util.Scanner;

public class ClimbingStairs 
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number of stairs to reach top");
		
		int number = userInput.nextInt();
		
		/*
		 * Creating an object of same class.
		 */
		
		ClimbingStairs obj = new ClimbingStairs();
		
		
		int differentWays = obj.climbStairs(number);
		
		System.out.println("There are " +differentWays +" differentways to climb " +number +" stairs");
		
	}
	
	public int climbStairs(int n)
	{
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		
		if(n>1)
		{
			return climbStairs(n-1) + climbStairs(n-2);
		}
		
		return 0;
		
		
		
		/*
		 * This problem will be solved only by recurssion.
		 */
	}

}
