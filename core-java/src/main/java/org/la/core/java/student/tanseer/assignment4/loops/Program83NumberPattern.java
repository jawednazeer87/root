package org.la.core.java.student.tanseer.assignment4.loops;

public class Program83NumberPattern 
{
	public static void main(String[] args) 
	{
		int rows = 5 ;
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		
	}
}

