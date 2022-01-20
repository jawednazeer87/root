package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * wap to find length of an array
 */
public class RevisePracticeArray03 
{

	public static void main(String[] args)
	{
		int[] a = new int[15]; 
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i + 1;
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n Array Length : "+a.length);
    }

}



