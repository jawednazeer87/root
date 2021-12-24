package org.la.core.java.student.sjmohammed.assignment4;

public class Example62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=125,s=0,temp=n;
		while(n>0) {
			int r=n%10;
			s=s*10+r;
			n=n/10;
		}
		n=temp;
		System.out.println("Reversed "+s);
		if(n==s) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
