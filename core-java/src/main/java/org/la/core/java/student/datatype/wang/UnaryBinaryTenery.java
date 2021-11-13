package org.la.core.java.student.datatype.wang;

public class UnaryBinaryTenery {

	public static void main(String[] args) {
		/*
		 * @unary operator operates on one operands
		 * @Binary operator operates on two operands
		 * @Tenery operator operates on three operands
		 */
		
		//increment ++ : 2 categories: post increment and post increment
		//decrement --
		
		int x =9;
		int y =++x;
		int z =x++;
		System.out.println("x "+x);
		// post-increment: later increase by 1
		System.out.println("y "+y);
		//pre-increment: immediately increase by 1
		System.out.println("z "+z);
		
		
		/*
		 Binary operators: 
		 Arithmetic:  + - * / % 
		 Relational: ==, !=,>=,>,<=,<
		 Logical: &&, ||,   (!not is unary)
		 */
		
		//%
		int a= 4;
		int b= 5;
		int c= a/b;
		System.out.println("c "+c);
		
		//Relational return boolean only
		boolean d= 1==3;
		System.out.println("d = "+d);
		
		boolean e= a!=b;
		System.out.println("e = "+ e);
		
		
	}
}
