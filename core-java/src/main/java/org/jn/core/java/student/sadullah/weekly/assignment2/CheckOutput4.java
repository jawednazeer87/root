package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CheckOutput4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
