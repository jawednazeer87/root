package org.la.core.java.student.tanseer.assignment4.loops;

public class Program85NumberPyramidLeftSide 
{
	public static void main(String[] args) 
	{
		int rows = 3;
		
		for(int i = 1; i <= rows; i++)
		{
			for(int spc = rows - 1 ; spc >= i ; spc--) 
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
		
	}
}

