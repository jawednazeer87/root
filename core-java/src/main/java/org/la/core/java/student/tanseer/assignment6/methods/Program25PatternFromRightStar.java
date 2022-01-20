package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void printStarFromRight(int n)
	print star pattern from right

		  
 */
public class Program25PatternFromRightStar 
{

	public static void main(String[] args) 
	{
		printStarFromRight(10);
	}
	
	static void printStarFromRight(int rows)
	{
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int spc = rows - 1; spc >= i ; spc --)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i  ; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

