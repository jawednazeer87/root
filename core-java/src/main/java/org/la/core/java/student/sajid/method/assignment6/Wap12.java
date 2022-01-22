package org.la.core.java.student.sajid.method.assignment6;

public class Wap12 {

	public static void main(String[] args) {
		// int[] addTwoArrays(int[], int[]) - all array of same size
		//add two supplied arrays elements and then copy the some of each element to 3rd array and 
		//return 3rd array.

		int arr1[] = {1,1,1,1,1};
		int arr2[] = {2,2,2,2,2};
		
		int arr3 [] = addTwoArrays(arr1,arr2);	
		
		for (int i:arr3){
			System.out.println(i);
		}
	}

	static int[] addTwoArrays(int[] a, int[] b) {
		
		int[] c = new int [a.length];
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i]+b[i];
		}
		
		return c;		
	}
}
