package org.la.core.java.student.sajid.array.assignment5;

public class Wap47 {

	public static void main(String[] args) {
		// wap to count all 1's of an int array
		// Suppose given array is [10, 19, 2, 7] -> number of 1's here zero
		// Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 1's here 3
		
		int arr[] = {10, 19, 2, 7};
		int count = 0;
		
		System.out.print("Count of num 1 in the given array arr is: ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		System.out.println(count);
		
		int arr1[] = {1, 19, 1, 7, 1, 3};
		int count1 = 0;
		
		System.out.print("Count of num 1 in the given array arr1 is: ");
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==1) {
				count1++;
			}
		}
		System.out.println(count1);
		

	}

}
