package org.la.core.java.student.tanseer.assignment4.loops;

public class Program78PatternRightAngleWithSpaceFirst 
{
	public static void main(String[] args) 
	{
		int row = 5;
		for(int i = row ; i > 0 ; i-- )
		{
			for(int spc = row ; spc > i ; spc --)
			{
				System.out.print(" ");
			}
			for(int col = 1 ; col <= i ; col ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

			