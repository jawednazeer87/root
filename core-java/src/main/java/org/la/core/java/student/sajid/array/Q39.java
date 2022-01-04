package org.la.core.java.student.sajid.array;

public class Q39 {
	public static void main(String[] args) {
		// 39) wap to subtract -1 from each element of an array

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] - 1;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
