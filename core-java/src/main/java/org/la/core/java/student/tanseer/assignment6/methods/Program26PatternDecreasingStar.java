package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void printStarReverse(int n)
	print star pattern in decrease order 
	  
 */
public class Program26PatternDecreasingStar 
{

	public static void main(String[] args) 
	{
		printStarReverse(4);
	}
	
	static void printStarReverse(int n)
	{
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 0 ; j <= n-i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

