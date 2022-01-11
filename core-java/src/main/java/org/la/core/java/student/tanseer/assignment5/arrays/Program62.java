package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print all numbers from 1 to 10 except 3 and 7.
 */

public class Program62 
{

	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 10 ;i++)
		{
			if(i == 3 || i == 7)
			{
				continue;
			}
			System.out.print(i +" ");
		}
	}	
	
}
