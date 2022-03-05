package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * Create a parent class having a method void increaseStar(int) override this method in 
 * child class increaseStar will print star in increasing order.
 */
public class IncreasingStar 
{
	protected void increaseStar(int n)
	{
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
