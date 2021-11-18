package org.la.core.java.student.datatype.waleed;

public class Operators {

	public static void main(String[] args) {
		/*
		 * @unary operator operates  on one operand
		 * @Binary operator operates on two operands
		 * @Tenary operator operates on three operands
		 */
		
		//increment ++ : 2 categories: post increment and post increment
		//decrement --
		
		int n =11;
		int m= ++n;
		int k =n++;
		System.out.println("n "+n);
		// post-increment:   increase by 1 after doing assignment
		System.out.println("m "+m);
		//pre-increment: immediately without delay increase by 1
		System.out.println("k "+k);
		
		/***
		 * Unary Arithmetic Operators
     Operator
                     Description
      '+'
              Unary plus operator; indicates positive value (numbers are positive without this, however)
      '-'
               Unary minus operator; negates an expression value
     '++'
              Increment operator; increments a value by 1
     '--'
              Decrement operator; decrements a value by 1
     '!'
              Logical complement operator; inverts the value of a boolean
		 ***/
		
		
		/*
		 Binary operators: 
		 Arithmetic:  + - * / % 
		 Relational: ==, !=,>=,>,<=,<
		 Logical: &&, ||,  !=
		 */
		
		int f=14;
		int g= 7;
		int h=f/g;
		System.out.println("h "+h);

	}

}
