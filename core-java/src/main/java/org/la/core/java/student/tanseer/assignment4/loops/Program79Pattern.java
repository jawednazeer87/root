package org.la.core.java.student.tanseer.assignment4.loops;

public class Program79Pattern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		for(int i = 0 ; i < n; i++)
		{
			for(int spc = n ; spc > i; spc--)
			{
				System.out.print(" ");
			}
			for(int col = 0 ; col <= i ; col ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

			