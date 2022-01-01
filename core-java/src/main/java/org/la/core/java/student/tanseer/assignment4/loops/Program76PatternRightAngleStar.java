package org.la.core.java.student.tanseer.assignment4.loops;

public class Program76PatternRightAngleStar 
{
	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("Right Angle Star Pattern " );
		System.out.println();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
