package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program16ReverseArray 
{

	public static void main(String[] args) 
	{
		int[] a = {-10, -20, 30, 40, -150, 60, 70, 80};
		
		for(int i = a.length - 1; i >= 0; i--)
		{
				System.out.println("a ["+i+"] = "+a[i]);
		}
		
	}

}
