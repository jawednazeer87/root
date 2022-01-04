package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program21PrimeArray 
{

	public static void main(String[] args) 
	{
		int a[] = new int[40];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i + 1;
			
			int j ;
			for( j = 2; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					break;
				}
			}
			if(a[i] == j)
			{
				System.out.println(" Prime Numbers are a["+i+"] = "+a [i]);
			}
			
			
		}
		
	}	
}
