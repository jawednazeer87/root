package org.la.core.java.student.sjmohammed.assignment5;
/*
 * wap to copy an array to another array in reverse order
 */

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {84,14,5,57,4,12,1};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"] "+b[i]);
		}
		for(int i=b.length-1;i>=0;i--) {
			System.out.println("Reverse b["+i+"] "+b[i]);
		}
		
	}

}
