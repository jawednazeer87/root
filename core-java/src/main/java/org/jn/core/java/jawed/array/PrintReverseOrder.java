package org.jn.core.java.jawed.array;

public class PrintReverseOrder {

	public static void main(String[] args) {
		
		int a[] = {4, 2, 0, 1, 77};
		
		for(int b=a.length-1 ; b>=0 ; b--) {
			System.out.println("a["+b+"] = "+a[b]);
		}
	}
}
