package org.la.core.java.student.sajid.array;

public class Q30 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 9, 5, 6, 7 };
		int[] arr2 = { 1, 2, 2, 4, 8, 4, 5 };
		int j, i;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr2[j] + " ");
				}
			}
		}
	}

}
