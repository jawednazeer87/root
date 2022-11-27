package org.jn.core.java.jawed.array;

public class PrintPositive {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4,-1, -4};
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]>=0) {
				System.out.println("a["+i+"]: "+a[i]);
			}
		}
	}
}
