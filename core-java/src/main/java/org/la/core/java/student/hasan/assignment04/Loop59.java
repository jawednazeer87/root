package org.la.core.java.student.hasan.assignment04;

public class Loop59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, n=369;
		while(n!=0) {
			int rem=n%10;
					sum= sum+rem;
			n=n/10;
		}System.out.println("sum of digits="+sum);
	}

}
