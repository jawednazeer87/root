package org.la.core.java.student.mdfarman.method.assignment6;


public class Question9 {

	//		int average(int[])
//	find the average of array elements and return average

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int avg= average(arr);
		System.out.println(avg);
	}

	public static int average(int[] arr) {
		int sum = 0, number = arr.length, avg = 0;
		 		
		for(int i : arr) {
			sum += i;
		}
		avg = sum/number;
		return avg;
	}
	

}
