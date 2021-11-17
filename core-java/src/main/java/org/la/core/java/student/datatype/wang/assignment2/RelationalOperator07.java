package org.la.core.java.student.datatype.wang.assignment2;

public class RelationalOperator07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. int a = 10; int b = 3; boolean x = a++==10 && ++b==4; boolean y = --a==10
		 * || b--<4; sop(a); sop(b); sop(x); sop(y);
		 */
		int a = 10;
		int b = 3;
		boolean x = a++ == 10 && ++b == 4;
		boolean y = --a == 10 || b-- < 4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

}
