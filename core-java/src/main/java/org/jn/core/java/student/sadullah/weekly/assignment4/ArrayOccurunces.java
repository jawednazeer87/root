package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayOccurunces {
	public static void main(String[] argrs) {
		int[] arr = {5, 5, 5, 5, 8, 8, 8, 8, 8, 8, 9, 9, 2, 2, 2, 2,};

		int maxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}

		int[] counts = new int[maxValue + 1];

		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];

			counts[element]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]);
		}
	}
}
