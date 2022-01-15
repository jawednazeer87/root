package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program30CommonElementsBetweenTwoArrays 
{

	public static void main(String[] args) 
	{
		int[] a = new int[] {11 , 22 , 44 , 66, 33 };
		int[] b = new int[] {11 , 33 , 55 , 66, 33 };
		
		int flag = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					int com = b[j];
					System.out.println("Common elements are : "+com);
				}
				else if(flag == 0)
					System.out.println("No common elements ");

			}
		}
		
	}	
	
}
