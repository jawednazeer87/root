package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program41UpperCaseToLowerCase 
{

	public static void main(String[] args) 
	{
		char arr[] = {'a', 'b', 'c','e','w', 'r', 'h', 'x','n','v'};

		for(char a : arr)
		{
			System.out.print(a + " ");
		}

		for(char i = 0 ; i < arr.length ; i++)
		{
			arr[i] -= 32;
		}

		System.out.println();
		for(char a : arr)
		{
			System.out.print(a + " ");
		}
	}	
	
}
