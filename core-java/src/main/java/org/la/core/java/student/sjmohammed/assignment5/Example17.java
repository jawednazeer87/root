package org.la.core.java.student.sjmohammed.assignment5;
/*
 * wap to copy two arrays into one array
 */
public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {25,4,8,36,5};
		int b[]= {56,5,3,45,4};
		int c[]= new int[a.length + b.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			c[j++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[j++]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"] = "+c[i]);
		}
	}

}
