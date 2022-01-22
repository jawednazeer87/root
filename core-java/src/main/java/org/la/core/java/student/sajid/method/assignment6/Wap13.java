package org.la.core.java.student.sajid.method.assignment6;

public class Wap13 {

	public static void main(String[] args) {
		// 13)	int[] copyArrays(int[], int[]) - target array 
		//size = size of arr1 + size of arr2
		//copy first array and second array to two third array.
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		
		int[] arr3 = copyArrays(arr1,arr2);
		
		for(int i:arr3) {
			System.out.println(i);
		}
	}
	
	static int[] copyArrays(int[] a,int[] b) {
		
		int[] c = new int[a.length+b.length];
		
		int ctr = 0;
		
		for(int i=0;i<a.length;i++) {
			c[ctr] = a[i];
			ctr++;
		}
		
		for(int i=0;i<b.length;i++) {
			c[ctr] = b[i];
			ctr++;
		}
		
		return c;
	}

}
