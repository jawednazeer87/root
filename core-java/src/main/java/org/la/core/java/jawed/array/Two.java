package org.la.core.java.jawed.array;

public class Two {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);
		System.out.println("a: "+a);
		a[0] = 2;
		a[1] = 7;
		a[2] = -1;
		System.out.println("a[0]: "+a[0]);
		System.out.println("a[1]: "+a[1]);
		System.out.println("a[2]: "+a[2]);
		a = new int[5];
		System.out.println("a: "+a);
	}
}
