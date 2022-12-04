package org.jn.core.java.jawed.array;

public class TwoArrPointSameLocation {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, -1, -4};
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
		int b[] = a;
		b[3] = 100;
		b[0] = -1000;
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
	}
}
