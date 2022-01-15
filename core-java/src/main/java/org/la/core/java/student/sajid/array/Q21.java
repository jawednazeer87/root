package org.la.core.java.student.sajid.array;

public class Q21 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int b[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[i]=a[i];
				System.out.println(b[i]);
			}
		}
	}

}
