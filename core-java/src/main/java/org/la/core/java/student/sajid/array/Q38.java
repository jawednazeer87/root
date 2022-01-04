package org.la.core.java.student.sajid.array;

public class Q38 {
	public static void main(String[] args) {
		// 38) Find largest and smallest elements of an array? 

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int largestNum = arr1[0], smallestNum = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > largestNum)
				largestNum = arr1[i];

			if (arr1[i] < smallestNum)
				smallestNum = arr1[i];
		}
		System.out.println("Largest Number : " + largestNum);
		System.out.println("Smallest Number : " + smallestNum);
	}

}
