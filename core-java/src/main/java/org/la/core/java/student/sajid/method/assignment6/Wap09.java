package org.la.core.java.student.sajid.method.assignment6;

public class Wap09 {

	public static void main(String[] args) {
		// 9)	int average(int[])
		//find the average of array elements and return average

		int arr1[] = {2,4,6,8};
		
		int avg = average(arr1);
		System.out.println("Average of all array elements in the array is: "+avg);
	}
	
	static int average(int[] a) {
		
		int avg = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		avg = sum/a.length;
		return avg;
	}

}
