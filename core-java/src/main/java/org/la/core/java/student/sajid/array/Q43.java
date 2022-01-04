package org.la.core.java.student.sajid.array;

public class Q43 {
	/*
	 * wap to multiply 3 to each element of an array Suppose given array is [10, 19,
	 * 2, 7] -> answer 30, 57, 6, 21
	 */
	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			a[i]*=3;
			System.out.println(a[i]);
		}
	}
}