package org.la.core.java.student.tanseer.assignment4.loops;

public class Program77DownwardsStarPattern 
{
	public static void main(String[] args) 
	{
		int n = 4 ;
		for(int row = 1 ; row <= n ; row ++)
		{
			for(int col = 0 ; col <= n - row ; col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
