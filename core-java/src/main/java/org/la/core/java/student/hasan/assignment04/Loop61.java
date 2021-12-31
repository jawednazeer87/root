package org.la.core.java.student.hasan.assignment04;

public class Loop61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2345, rev=0;
		while(n!=0) {
			int rem= n%10;
			rev=rev*10+rem;
			n=n/10;
		}System.out.println("reversed number="+rev);
	}

}
