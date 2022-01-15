package org.la.core.java.student.majeed.assignment6;

public class Program6 {

	public static void main(String[] args) {
		/*
		void copy(int[], int[])
		copy first array to second array
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		int[] arr2=null;
		copy(arr1,arr2);
	}	
	
	static void copy(int[] a, int[] b) {
		b = a;
		for(int a1:b) {
				System.out.println(a1);
		}		
	}
}