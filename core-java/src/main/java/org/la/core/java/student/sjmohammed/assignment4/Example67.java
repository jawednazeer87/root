package org.la.core.java.student.sjmohammed.assignment4;

public class Example67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=3;n<=30;n++) {
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				break;
			}
		}
		if(n==i) {
			System.out.println("Prime number: "+n);
		}
	}
	}		

}
