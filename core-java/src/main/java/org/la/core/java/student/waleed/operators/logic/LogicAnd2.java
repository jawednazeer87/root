package org.la.core.java.student.waleed.operators.logic;

public class LogicAnd2 {

	public static void main(String[] args) {
		int n = 5, m = 10;
		boolean a = (n++==5) && (--m==9); 
		
		System.out.println("a: "+a);
		System.out.println("n: "+n);
		System.out.println("m: "+m);

	}

}
