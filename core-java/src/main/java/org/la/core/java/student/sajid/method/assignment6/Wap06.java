package org.la.core.java.student.sajid.method.assignment6;

public class Wap06 {

	public static void main(String[] args) {
		// 6) void copy(int[], int[])
		// copy first array to second array

		int arr1[] = {2,4,6,8};
		int arr2[] = new int[arr1.length];
		
		copy(arr1,arr2);
		
		for(int i:arr2) {
			System.out.println(i);
		}
		
	}
	
	static void copy(int[] a,int[] b) {
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
	}

}
