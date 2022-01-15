package org.la.core.java.student.sjmohammed.assignment3;

public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {25,4,8,36,5};
		int b[]= {56,5,3,45,4};
		int c[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			
		}
		for(int i=0;i<b.length;i++) {
			c[i]+=b[i];
			System.out.println("c["+i+"] "+c[i]);
		}
		
	}

}
