package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program12CopyArrayReverse 
{

	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] b = new int[a.length];
		
		for(int i = a.length - 1; i >= 0; i-- )
		{
			b[i] = a[i];
			
			System.out.println(" b["+i+"] = "+b[i]);
		}
		
	}

}
