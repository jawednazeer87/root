package org.la.core.java.student.sajid.array;

public class Q42 {
	public static void main(String[] args) {
		/*
		 * wap to convert an array of characters from lower case to upper case, e.g if
		 * arr[] = {'A', 'b', 'C'} then after conversion final array should be arr[] =
		 * {'a', 'b', 'c'}
		 * 
		 */

		char[] arr1 = { 'A', 'B', 'C' };

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += 32;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
