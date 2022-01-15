package org.la.core.java.student.majeed.assignment6;

public class Program9 {

	public static void main(String[] args) {
		/*
		int average(int[])
		find the average of array elements and return average
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		average(arr1);
	}
	
	static void average(int[] a) {
		int total = 0, count = 0;
		for(int a1:a) {
			total += a1;
			count++;
		}
		System.out.println(total/count);
	}	

}