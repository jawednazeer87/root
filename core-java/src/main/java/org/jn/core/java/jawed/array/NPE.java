package org.jn.core.java.jawed.array;

public class NPE {

	public static void main(String[] args) {
		
		int[] a = new int[2];
		int size = a.length;
		System.out.println("size: "+size);
		a = null;
		size = a.length;
		System.out.println("size: "+size);
		
		
	}
}
