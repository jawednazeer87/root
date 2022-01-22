package org.la.core.java.student.sajid.method.assignment6;

public class Wap07 {

	public static void main(String[] args) {
		// 7)	int[] copy(int[])
		//create an array and copy supplied array and return that new array
		
		int[] arr1 = {2,4,6,8};
		
		copy(arr1);

	}
	
	static int[] copy(int[] a) {
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];			
		}
		for(int i:b) {
			System.out.println(i);
		}
		return b;
	}
}
