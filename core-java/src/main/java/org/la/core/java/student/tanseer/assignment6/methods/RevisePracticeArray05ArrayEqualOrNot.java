package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * 
 */

public class RevisePracticeArray05ArrayEqualOrNot 
{

	public static void main(String[] args)
	{
		int[] a = new int[] {10, -10, 0,- 9,-122};
		int[] b = new int[] {10, -10, 0,- 99,-122};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		 
		System.out.println("Common elements are : ");
		for(int a1 : a)
		{
			for(int b1 : b)
			{
				if(a1 == b1)
				{
					int equal = b1 ;
					System.out.print(" "+equal);
				}
			}
			
		}
    }

}



