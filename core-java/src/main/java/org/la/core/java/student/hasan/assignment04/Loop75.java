package org.la.core.java.student.hasan.assignment04;

public class Loop75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=1, c=0, n=10;
		System.out.print(a+" "+b);
		for (int i=0; i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b; b=c;
		}
	}

}
