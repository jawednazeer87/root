package org.la.core.java.student.operators.arithmetic.waleed;

public class ProdPreIncrent2 {

	public static void main(String[] args) {
		// i, m before assignments not affected but after do calculation of n, i, m both of them increased one...
		// n has the old value of i and m, but k has the new value of i and m....
		int i = 11;
		int m = 9;
		System.out.println("i: "+i);
		int n = 6 * ++i + m++;
		int k = i * m;
		
		System.out.println("i: "+i);
		System.out.println("m: "+m);
		System.out.println("n: "+n);
		System.out.println("k: "+k);
	}
	}


