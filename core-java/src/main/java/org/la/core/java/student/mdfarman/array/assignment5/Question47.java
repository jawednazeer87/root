package org.la.core.java.student.mdfarman.array.assignment5;



public class Question47 {
//	47)	wap to count all 1's of an int array
//	Suppose given array is [10, 19, 2, 7] -> number of 1's here zero
//	Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 1's here 3

	public static void main(String[] args) {
		int arr[] = {1, 19, 1, 7, 1, 3};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		System.out.println(count);
			
	}
}