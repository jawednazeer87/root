package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program54CheckIfAlpahabetIsPresentOrNot 
{

	public static void main(String[] args) 
	{
		char[] a = {'A', '5', 'Z', 'p'};
		boolean flag = true; 
		
		for(char i = 0; i < a.length; i++)
		{
			if(a[i] == 'Z')
			{
				flag = false;
				System.out.println("Character 'Z' is present : "+a[i]);
			}
	
		}
		if(flag)
		{
			System.out.println(" Character 'Z' is not present : ");
		}
	}	
	
}
