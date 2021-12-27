package org.la.core.java.student.sajid.array.assignment5;

public class Wap02 {

	public static void main(String[] args) {
		// wap to create and print array using loop
		
		int[] a = new int [3];
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.println("a["+i+"]: "+a[i]);
			
		}

	}

}
