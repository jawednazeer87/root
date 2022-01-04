package org.la.core.java.student.sajid.array;

public class Q17 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		int arr1 = a.length;
		int arr2 = b.length;

		int[] c = new int[arr1 + arr2];
		int i = 0;
		for (; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int j = 1; j < b.length; j++) {

			c[i] = b[j];
			i++;
		}

		for (int x = 0; x < c.length - 1; x++) {

			System.out.print(c[x]+" ");
		}

	}

}
