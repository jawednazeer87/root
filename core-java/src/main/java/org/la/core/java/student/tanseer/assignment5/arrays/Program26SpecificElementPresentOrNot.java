package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program26SpecificElementPresentOrNot 
{

	public static void main(String[] args) 
	{
		int a[] = {2, 2, 3, 4, 2, 4, 3, 44, 2, 3};
		int item = 444;
		
		int i ;
		for( i = 0; i < a.length; i++)
		{
			if(item == a[i])
			{
				System.out.println(" Item found :" + item);
				break;
			}
		}	

		if(i == a.length)
		{
			System.out.println("Item not found : "+ item);
		}
	}	
}
