package org.jn.core.java.student.sayed.hassain.relationalOperator;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -1;
		int b = 1;
		boolean x = ++a<=0 && ++b>1;// a=0 , b=2
		boolean y = --a > -2 || b-- < 1;// a=-1
		System.out.println("ans : -1 actual :" + a);
		System.out.println("ans : 2 actual : " + b);
		System.out.println("ans : true actual :" + x);
		System.out.println("ans : true  actual :" + y);
	}

}
