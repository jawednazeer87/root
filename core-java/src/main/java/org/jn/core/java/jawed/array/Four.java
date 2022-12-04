package org.jn.core.java.jawed.array;

public class Four {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, -1, -4};
		
		for(int i=0 ; i<a.length ; i++) {
			int x = a[i];
			System.out.println("a["+i+"]: "+x);
		}
	}
}
