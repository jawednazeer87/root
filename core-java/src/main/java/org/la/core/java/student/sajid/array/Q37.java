package org.la.core.java.student.sajid.array;

public class Q37 {
	public static void main(String[] args) {

		/*
		 * 37) wap to separate even and odd numbers of a given array of integers. Put
		 * all even numbers first, and then odd numbers ?
		 */

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = new int[arr1.length];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0)
				arr2[j++] = arr1[i];
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0)
				arr2[j++] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
