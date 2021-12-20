package org.la.core.java.student.sjmohammed.assignment4;

public class Example66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				break;
			}
		}
		if(n==i) {
			System.out.println("Prime number: "+n);
		}else {
			System.out.println("Not a prime number: "+n);
		}
	}

}
