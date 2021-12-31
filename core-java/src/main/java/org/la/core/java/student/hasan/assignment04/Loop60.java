package org.la.core.java.student.hasan.assignment04;

public class Loop60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1,r, n=234;
		while(n!=0) {
			r=n%10;
					p=p*r;
			n=n/10;
		}System.out.println("product of digits="+p);
	}

}
