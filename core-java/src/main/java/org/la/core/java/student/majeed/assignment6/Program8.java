package org.la.core.java.student.majeed.assignment6;

public class Program8 {

	public static void main(String[] args) {
		/*
		int sum(int[])
		find sum of all elements of an array and return sum
		 */
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; 
		sum(arr1);
	}
	
	static void sum(int[] a) {
		int total = 0;
		for(int a1:a) {
			total += a1;
		}
		System.out.println(total);
	}	

}