package org.la.core.java.student.sajid.array;

public class Q12 {
	public static void main(String[] args) {
		int a[]= {1,2,5,4,9};
		int b[] = new int [a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]+" ");
		}
		System.out.println("revers");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
