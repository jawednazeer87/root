package org.la.core.java.student.sajid.array.assignment5;

public class Wap48 {

	public static void main(String[] args) {
		// wap to count all 2's of an int array
		// Suppose given array is [10, 19, 2, 7] -> number of 2's here one
		// Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 2's here 0

		int arr[] = {10, 19, 2, 7};
		int count = 0;
		
		System.out.print("Count of num 2 in the given array arr is: ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				count++;
			}
		}
		System.out.println(count);
		
		int arr1[] = {1, 19, 1, 7, 1, 3};
		int count1 = 0;
		
		System.out.print("Count of num 2 in the given array arr1 is: ");
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==2) {
				count1++;
			}
		}
		System.out.println(count1);
		
	}

}
