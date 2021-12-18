package org.la.core.java.jawed.array;

public class Three {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		for(int i=0 ; i<a.length ; i++) {
			a[i] = i+1;
		}
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
	}
}
