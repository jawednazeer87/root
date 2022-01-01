package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program23OccurrenceOfElements 
{

	public static void main(String[] args) 
	{
		int a[] = {2, 2, 3, 4, 2, 4, 3, 4, 2, 3};
		int f[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					f[j] = 0;
				}
			}
			
			if(f[i] != 0)
			{
				f[i] = count;
			}
			
		}
		
		for(int i = 0; i < a.length; i++ )
		{
			if(f[i] != 0)
			{
				System.out.println(a[i]+" comes "+f[i]+" times");
			}
		}
	}	
}
