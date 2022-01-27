package org.la.core.java.student.mdfarman.method.assignment6;

import java.util.Arrays;

public class Question13 {

//			int[] addTwoArrays(int[], int[]) - all array of same size
//	add two supplied arrays elements and then copy the some of each element to 3rd array and 
//	return 3rd array
//	copy from tanseer

	public static void main(String[] args) {
		int[] arr1 = {10 , 20 , 30, 40, 50};
		int[] arr2 = {10 , 20 , 30, 40, 50};
		int[] arr3 = addTwoArrays(arr1, arr2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("Adding two arrays");
		System.out.println(Arrays.toString(arr3));
	}

	static int[] addTwoArrays(int[]a, int[]b)
	{
		int length = a.length < b.length ? a.length : b.length;
		int[] result = new int[length];
		
		for(int i  = 0; i < length ; i++)
		{
			result[i] = a[i] + b[i];
		}
		
		return result;
	}


}
