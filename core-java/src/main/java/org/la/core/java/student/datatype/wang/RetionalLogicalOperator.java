package org.la.core.java.student.datatype.wang;

public class RetionalLogicalOperator {
public static void main(String[] args) {
	//Relational return boolean only
			boolean d= 1==3;
			System.out.println("d = "+d);
			
			boolean e= a!=b;
			System.out.println("e = "+ e);
			
			//Logical : && || !(not)
			int x=1, y=2;
			boolean b= x==y && y++==3;
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("b = "+b);
}
}
