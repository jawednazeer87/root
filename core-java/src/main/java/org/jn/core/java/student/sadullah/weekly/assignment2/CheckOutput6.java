package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CheckOutput6 {

	public static void main(String[] args) {
		int a = -1;
		int b = 1;
		boolean x = ++a<=0 && ++b>1;
		boolean y = --a > -2 || b-- < 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
