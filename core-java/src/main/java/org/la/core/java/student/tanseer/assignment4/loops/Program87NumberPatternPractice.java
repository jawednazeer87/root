package org.la.core.java.student.tanseer.assignment4.loops;

public class Program87NumberPatternPractice 
{
	public static void main(String[] args) 
	{
		int n = 4 ;
		
		for(int i = 1 ; i <= n; i++) 
		{
			for(int spc = n - 1 ; spc >= i ; spc--)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

