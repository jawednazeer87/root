package org.jn.core.java.student.sayed.hassain.methods;

public class CountOneZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 0, 1, 0, 0, 1, 1 };
		int a[] = countOneZero(arr);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");
	}

	static int[] countOneZero(int arr[]) {
		int c0 = 0, c1 = 0;
		for (int x : arr) {
			if (x == 0)
				c0++;
			else if (x == 1)
				c1++;
		}
		int a[] = { c0, c1 };
		return a;
	}

}
