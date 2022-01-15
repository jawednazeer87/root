package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void printStarReverseRight(int n)
	print star in decreasing order from right

 */
public class Program27PatternDecreasingStarFromRight 
{

	public static void main(String[] args) 
	{
		printStarReverseRight(4);
	}
	
	static void printStarReverseRight(int n)
	{
		for(int i = 0 ; i < n ; i++)
		{
			for(int spc = n; spc > i; spc --)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

