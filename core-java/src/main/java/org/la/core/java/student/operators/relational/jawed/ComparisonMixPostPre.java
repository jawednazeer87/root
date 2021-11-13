package org.la.core.java.student.operators.relational.jawed;

public class ComparisonMixPostPre {

	public static void main(String[] args) {
		
		int x = 5, y = 6;
		
		boolean b = ++x == y++;
		
		System.out.println("b: "+b);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}