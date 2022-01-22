package org.la.core.java.student.sajid.method.assignment6;

public class Wap08 {

	public static void main(String[] args) {
		// 8)	int sum(int[])
		//find sum of all elements of an array and return sum

		int arr[] = {2,3,4,5,6,7};
		
		int total = sum(arr);
		System.out.println("Sum of all elements in the array is: "+total);
		
	}
	
	static int sum(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s = s + a[i];
		}
		return s;
	}

}
