package org.la.core.java.student.tanseer.assignment4.loops;

public class Program82RightAngleNumbers 
{
	public static void main(String[] args) 
	{
		int rows = 4 ;
		
		for(int i = 1 ; i <= rows ; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}
}

