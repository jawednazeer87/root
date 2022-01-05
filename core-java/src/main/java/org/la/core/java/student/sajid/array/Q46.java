package org.la.core.java.student.sajid.array;

public class Q46 {
	/*
	 * 46) wap to add all odd numbers of an array and print the sum Suppose given
	 * array is [10, 19, 2, 7] -> sum=26 which is sum of 19 and 7, both are odd
	 */
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0)
				sum += arr1[i];
		}
		System.out.println(sum);

	}

}
