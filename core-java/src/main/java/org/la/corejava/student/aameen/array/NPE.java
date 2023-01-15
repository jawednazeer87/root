package org.la.corejava.student.aameen.array;

public class NPE {

	public static void main(String[] args) {
		// Null pointer exception'
		int a[]= {1,2,3,4};
		int size=a.length;
		System.out.println("size : "+size);
		a=null;
		size=a.length;
		System.out.println("size : "+size);
	}

}
