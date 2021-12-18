package org.la.core.java.student.sjmohammed.assignment4;

public class Example56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=51554, first=0,last=0;
		last=n%10;
		while(n>0) {
			int r=n%10;
			n=n/10;
			first=r;
		}
		System.out.println("First "+first);
		System.out.println("Last "+last);
	}

}
