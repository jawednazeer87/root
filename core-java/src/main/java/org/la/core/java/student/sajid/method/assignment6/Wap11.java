package org.la.core.java.student.sajid.method.assignment6;

public class Wap11 {

	public static void main(String[] args) {
		// 11)	int smallest(int[])
		//find smallest element of an array and return that smallest value
		
		int arr [] = {10,10,90,30,80};
		
		int grt = smallest(arr);
		System.out.println("smallest element in the array is: "+grt);
	}
	
	static int smallest(int[] a) {
		int idx = a[0];
		
		for(int i=0;i<a.length;i++) {
			if (idx>a[i]) {
				idx = a[i];
			}
		}
		return idx;

	}

}
