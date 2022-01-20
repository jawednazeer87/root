package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * create a class name PatternPrinting
		create these methods
			static void increasingStar(int)
			static void decreasingStar(int)
			static void increasingStarWithSpace(int)
			static void decreasingStarWithSpace(int)
			static void pyramid(int)
			static void reversePyramid(int)
			static void diamond(int)
			static void numRow(int)
			static void numColumn(int)

 */
public class Program34PatternPrinting 
{

	public static void main(String[] args) 
	{
		increasingStar(4);
		decreasingStar(4);
		increasingStarWithSpace(4);
		decreasingStarWithSpace(4);
		pyramid(4);
		reversePyramid(4);
		diamond(4);
		numRow(4);
		numColumn(4);
	}
	
	static void increasingStar(int n)
	{
		System.out.println("Increasing Star:");
		for(int row = 1 ; row <= n ; row++)
		{
			for(int col = 1 ; col <= row ; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void decreasingStar(int n)
	{
		System.out.println("Decreasing Star:");
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
	
	static void increasingStarWithSpace(int n)
	{
		System.out.println("Increasing Star with space :");
		for(int row = 1 ; row <= n ; row++)
		{
			for(int col = 1; col <= row ; col++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
	
	static void decreasingStarWithSpace(int n)
	{
		System.out.println("Decreasing Star with space :");
		for(int row = 1 ; row <= n ; row++)
		{
			for(int col = 0 ; col <= n - row; col ++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
	
	static void pyramid(int n)
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
	
	static void reversePyramid(int n)
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
	
	static void diamond(int n)
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
	
	static void numRow(int n)
	{
		System.out.println("Row Numbers");
		for(int row = 1 ; row <= n; row++)
		{
			for(int col = 1; col <= row ; col++)
			{
				System.out.print(" "+row);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void numColumn(int n)
	{
		System.out.println("Column Numbers");
		for(int row = 1 ; row <= n; row++)
		{
			for(int col = 1; col <= row ; col++)
			{
				System.out.print(" "+col);
			}
			System.out.println();
		}
		System.out.println();
	}
}

