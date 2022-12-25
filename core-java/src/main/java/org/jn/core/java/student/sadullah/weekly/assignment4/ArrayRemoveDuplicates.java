package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayRemoveDuplicates {
	public static void main(String[] argrs) {
		int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4};

		int maxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}

		int[] uniqueElements = new int[maxValue + 1];

		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];

			if (uniqueElements[element] == 0) {
				uniqueElements[element] = element;
			}
		}

		for (int i = 0; i < uniqueElements.length; i++) {
			if (uniqueElements[i] != 0) {
				System.out.println(uniqueElements[i]);
			}
		}
	}
}
