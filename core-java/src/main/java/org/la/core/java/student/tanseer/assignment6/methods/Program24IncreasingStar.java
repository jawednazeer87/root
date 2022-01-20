package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void printIncrStar(int n)
		print star pattern

		  
 */
public class Program24IncreasingStar 
{

	public static void main(String[] args) 
	{
		printIncrStar(4);
	}
	
	static void printIncrStar(int n)
	{
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

