package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program53CheckIfAlpahabetIsPresentOrNot 
{

	public static void main(String[] args) 
	{
		char[] a = {'a', '5', '7', 'p'};
		boolean flag = true; 
		
		for(char i = 0; i < a.length; i++)
		{
			if(a[i] == 'a')
			{
				flag = false;
				System.out.println("Character 'a' is present : ");
			}
	
		}
		if(flag)
		{
			System.out.println(" Character 'a' is not present : ");
		}
	}	
	
}
