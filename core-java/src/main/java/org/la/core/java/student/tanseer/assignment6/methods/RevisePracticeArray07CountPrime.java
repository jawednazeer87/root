package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * 
 */

public class RevisePracticeArray07CountPrime 
{

	public static void main(String[] args)
	{
		int[] a = new int[] {100, 19, 2, 7, 50};
		int count = 0;
		
		for(int b : a)
		{
			System.out.print(b + " ");
		}
		for(int i = 0; i < a.length; i++ )
		{
			int j;
			for(j = 2 ; j <= a[i] ; j++)
			{
				if(a[i] % j == 0)
				{
					break;
				}
			}
			if(a[i] == j)
			{
				count ++ ;
				
			}
		}
		
		System.out.println();
		System.out.println("Number of prime number are : "+ count);

	}

}



