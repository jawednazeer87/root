package org.la.core.java.student.sajid.array;

public class Q31 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 7 };
		int b[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[j] = a[i];
				j++;
			}
		}
		b[j]=a[a.length-1];
		for(int l=0;l<b.length;l++) {
			System.out.print(b[l]);
		}
	}

}
