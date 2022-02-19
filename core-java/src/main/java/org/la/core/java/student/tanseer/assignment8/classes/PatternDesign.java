package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * creat a class having name Pattern, then add methods to print all patterns like increaseStar, 
 * decreaseStar, increaseStartFromRight, decreaseStartFromRight, diamond, pyramid, reversePyramid.
 * All these methods will accept one int argument and will not return anything.
 */
public class PatternDesign 
{
	public void increaseStar(int n)
	{
		System.out.println("Increasing Star Pattern");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void decreaseStar(int n)
	{
		System.out.println("Decreasing Star Pattern");
		for(int row = 1; row <= n; row++)
		{
			for(int col = 0 ; col <= n - row ; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void pyramid(int n)
	{
		System.out.println("Star Pyramid :");
		for(int row = 0; row < n; row++)
		{
			for(int spc = n - row; spc > 1; spc--)
			{
				System.out.print(" ");
			}
			
			for(int col = 0; col <= row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void reversePyramid(int n)
	{
		System.out.println("Reverse Pyramid :");
		for(int row = n ; row > 0 ; row --)
		{
			for(int spc = n ; spc > row; spc--)
			{
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void  diamond(int n)
	{
		System.out.println("Diamond Pattern :");
		for(int i = -n ; i <= n; i++)
		{
			int j = i;
			if(j < 0)
			{
				j = -j;
			}
			for(int k = 1 ; k <= j ; k++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= n - j; k++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
