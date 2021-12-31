package org.la.core.java.student.tanseer.assignment4.loops;

public class Program81UpsidePyramid 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		for(int i = n; i > 0; i--)
		{
			for(int j = n  ; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

