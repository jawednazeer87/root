package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question50 {
//		50)	wap to find the largest and smallest number in an integer array
//	Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20


	public static void main(String[] args) {
		int arr[] = {100, 30, -20, 0};
		Arrays.sort(arr);
		System.out.println("Largest = "+arr[arr.length-1]);	
		System.out.println("Smallest = "+arr[0]);	
		
	}
}
