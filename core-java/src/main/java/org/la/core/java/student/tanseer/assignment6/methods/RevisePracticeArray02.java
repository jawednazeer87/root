package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * wap to create and print array using loop
 */
public class RevisePracticeArray02 
{

	public static void main(String[] args)
	{
		int[] a = new int[15]; 
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i + 1;
		}
		int i = 0;
		for(int b : a)
		{
			System.out.println("b [ "+i++ +" ] = "+b);	
			
		}
    }

}



