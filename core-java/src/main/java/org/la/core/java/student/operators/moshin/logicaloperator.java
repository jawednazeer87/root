package org.la.core.java.student.operators.moshin;

public class logicaloperator {

	public static void main(String[] args) {
		
		//Logical : && || !(not)
		
		int x=1, y=2;
		boolean b= x==y && y++==3;
		System.out.println("b = "+b);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
		
		int x1 = 1, y1 = 2;
		boolean b1 = x1==y1  ||  y1++==3;
		System.out.println("b = "+b1);
		System.out.println("x = "+x1);
		System.out.println("y = "+y1);
		
		}

}
