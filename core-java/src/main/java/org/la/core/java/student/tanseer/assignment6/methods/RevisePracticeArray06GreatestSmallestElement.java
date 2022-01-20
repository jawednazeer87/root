package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * 
 */

public class RevisePracticeArray06GreatestSmallestElement 
{

	public static void main(String[] args)
	{
		int[] a = new int[] {10, -10, 0,- 9,-122};
		int max = a[0];
		int min = a[0];
		
		System.out.println(Arrays.toString(a));
		for(int a1 : a)
		{
			if(a1 > max)
			{
				max = a1;
				
			}
			else if(a1 < min)
			{
				min = a1;
				
			}
		}
		System.out.println(" Greatest : "+max);
		System.out.println(" Smallest : "+min);
	}

}



