package org.la.core.java.student.hasan.assignment02;

public class RelOp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		int b = 1;
		boolean x = ++a<=0 && ++b>1;
		boolean y = --a > -2 || b-- < 1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
