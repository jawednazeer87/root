package org.la.core.java.student.mdfarman.array.assignment5;



public class Question46 {
//	46)	wap to add all odd numbers of an array and print the sum
//	Suppose given array is [10, 19, 2, 7] -> sum=26 which is sum of 19 and 7, both are odd

	public static void main(String[] args) {
		int arr[] = {10, 19, 2, 7};
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
			
	}
}
