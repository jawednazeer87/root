package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2
	copy first array and second array to two third array.


 */
public class Program13CopyArrayTargetSize 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {10, 20, 30, 40, 50, 60};
		int[] arr2 = {70, 80, 90, 100};
		
		int[] arr3 = copyArrays(arr1, arr2);
		System.out.println(Arrays.toString(arr3));
	}
	
	static int[] copyArrays(int[] a, int[] b)
	{
		int[] result = new int [a.length + b.length];
		
		int lengthOne = a.length;
		int lengthTwo = b.length;
		int lengthThree = result.length;
		
		System.out.println("size of first array : " +lengthOne);
		System.out.println(Arrays.toString(a));
		System.out.println("size of second array : "+lengthTwo);
		System.out.println(Arrays.toString(b));
		System.out.println("size of final array : " +lengthThree);
		
		for(int i = 0; i < a.length ; i++)
		{
			result[i] = a[i];
		}
		
		for(int i = 0; i < b.length ; i++)
		{
			result[a.length + i] = b[i];
		}
		return result;
	}
}

