package org.la.core.java.student.operators.relational.waleed;

public class ComparisonIncrement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 5;
		
		boolean w = n++ == m;
		boolean x = ++m <n;
		System.out.println("w: "+w);
		System.out.println("x: "+x);
		System.out.println("n: "+n);
		System.out.println("m: "+m);
	}

}
