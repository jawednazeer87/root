package org.jn.core.java.student.sayed.hassain.relationalOperator;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -4;
		int b = 0;
		boolean x = a < -5 && b == 4;
		boolean y = --a > -6 || b-- < -1;
		System.out.println("ans : -5 actual :" + a);
		System.out.println("ans : 0 actual : " + b);
		System.out.println("ans : false actual :" + x);
		System.out.println("ans : true actual :" + y);
	}
}
