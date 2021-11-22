package org.la.core.java.student.datatype.wang.assignment2;

public class RelationalOperator09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9. int a = -1; int b = 1; boolean x = ++a<=0 && ++b>1; boolean y = --a > -2
		 * || b-- < 1; sop(a); sop(b); sop(x); sop(y);
		 */
		int a = -1;
		int b = 1;
		boolean x = ++a <= 0 && ++b > 1;
		boolean y = --a > -2 || b-- < 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

}
