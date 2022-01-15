package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program42LowerCaseToUpperCase 
{

	public static void main(String[] args) 
	{
		char arr[] = {'A', 'B', 'C','E','W', 'R', 'H', 'X','N','V'};

		for(char a : arr)
		{
			System.out.print(a + " ");
		}

		for(char i = 0 ; i < arr.length ; i++)
		{
			arr[i] += 32;
		}

		System.out.println();
		for(char a : arr)
		{
			System.out.print(a + " ");
		}
	}	
	
}
