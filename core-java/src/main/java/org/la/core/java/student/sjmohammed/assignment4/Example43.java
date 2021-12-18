package org.la.core.java.student.sjmohammed.assignment4;

public class Example43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0, n=12345;
		for(;n>0;){
			int r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(s);
	}

}
