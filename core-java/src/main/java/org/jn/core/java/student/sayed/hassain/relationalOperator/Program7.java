package org.jn.core.java.student.sayed.hassain.relationalOperator;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 3;
		boolean x = a++ == 10 && ++b == 4;
		boolean y = --a == 10 || b-- < 4;
		
		System.out.println("ans : 10 actual :"+a);
		System.out.println("ans : 4 actual : "+b);
		System.out.println("ans : true actual :" +x);
		System.out.println("ans : true actual :"+y);
	}
}
