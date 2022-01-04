package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program27IndexOfArrayElementIfFound 
{

	public static void main(String[] args) 
	{
		int a[] = {2, 2, 3, 4, 202, 4, 3, 44, 2, 3};
		int flag = 0;
		int item = 44;
		
		for(int i = 0; i < a.length; i++)
		{
			if(item == a[i])
			{
				flag = 1;
				System.out.println("Item found "+item+" at a["+i+"] ");
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(item+" Item not found -1 ");	
		}
	}	
}
