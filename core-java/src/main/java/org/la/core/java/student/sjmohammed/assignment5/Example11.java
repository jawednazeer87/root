package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to copy one array into other array
 */
public class Example11 {

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
	}

}
