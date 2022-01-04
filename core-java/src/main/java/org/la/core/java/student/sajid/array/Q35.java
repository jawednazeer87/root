package org.la.core.java.student.sajid.array;

public class Q35 {
//	35) wap to check if an array of integers without 0 and -1?
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 0, 17, 0, 16, -1, 12 };
		boolean temp = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0 || arr1[i] == -1)
				temp = false;
		}
		if (temp == true) {
			System.out.println("Array does not Contains 0 or -1");
		} else
			System.out.println("Array Contains 0 or -1");

	}
}
