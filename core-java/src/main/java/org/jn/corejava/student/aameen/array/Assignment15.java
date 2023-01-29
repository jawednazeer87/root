package org.jn.corejava.student.aameen.array;

import java.util.Arrays;

public class Assignment15 {

	public static void main(String[] args) {
		// wap to copy two arrays into one array
		// wap to add two array elements n copy into third array
		int a[]= {1,2,3,4,};
		int b[]= {5,6,7,8};
		int c[]=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("c [] ="+Arrays.toString(c));
	}

}
