package org.la.core.java.student.sajid.array.assignment5;

public class Wap11 {

	public static void main(String[] args) {
		// wap to copy one array into other array
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int i=0;i<b.length;i++) {
			b[i] = a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}
		
	}

}
