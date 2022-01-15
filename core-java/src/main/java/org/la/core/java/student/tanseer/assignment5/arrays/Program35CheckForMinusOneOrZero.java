package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program35CheckForMinusOneOrZero 
{

	public static void main(String[] args) 
	{
		int[] a = {12, -1, 13, -1, 13, 0, 17 ,10, 0};
		
		for(int i = 0; i < a.length; i++ )
		{
			if(a[i] == 0 || a[i] == -1)
			{
				break;
			}
			else
				System.out.println("Present - 1 or 0");
			
		}
		
		
	}	
	
}
