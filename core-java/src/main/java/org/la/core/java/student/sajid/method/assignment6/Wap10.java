package org.la.core.java.student.sajid.method.assignment6;

public class Wap10 {

	public static void main(String[] args) {
		// 10)	int greatest(int[])
		//find greatest element of an array and return that greatest value
		
		int arr [] = {10,10,90,30,80};
		
		int grt = greatest(arr);
		System.out.println("Greatest element in the array is: "+grt);
	}
	
	static int greatest(int[] a) {
		int idx = a[0];
		
		for(int i=0;i<a.length;i++) {
			if (idx<a[i]) {
				idx = a[i];
			}
		}
		return idx;
	}

}
