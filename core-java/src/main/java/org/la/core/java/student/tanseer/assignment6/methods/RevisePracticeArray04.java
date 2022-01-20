package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * wap to print only negative number from an array
 */

public class RevisePracticeArray04 
{

	public static void main(String[] args)
	{
		int[] a = new int[] {10, -10, 0,- 9,-122};
		
		System.out.println(Arrays.toString(a));
		System.out.println("Negative elements are :");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < 0)
			{
				System.out.print(" "+a[i]);
			}
		}
		
    }

}



