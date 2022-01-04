package org.la.core.java.student.sajid.array;

public class Q19 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 4, 5, 6, 6, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
