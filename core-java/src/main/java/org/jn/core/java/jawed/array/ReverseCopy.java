package org.jn.core.java.jawed.array;

public class ReverseCopy {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = a[a.length-1-i];
		}
		System.out.println("targer array: ");
		for(int i=0; i<a.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		System.out.println("source array: ");
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
