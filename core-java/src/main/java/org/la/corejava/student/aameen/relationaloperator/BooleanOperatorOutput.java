package org.la.corejava.student.aameen.relationaloperator;

public class BooleanOperatorOutput {

	public static void main(String[] args) {
		// boolean cases operator output 
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;
		System.out.println("a :" +(a));
		System.out.println("b :" +(b));
		System.out.println("x :" +(x));
		System.out.println("y :" +(y));
		System.out.println(" ");

		System.out.println(" problem 8  ");
		System.out.println("---------");
		 bool();
			System.out.println(" ");

		 System.out.println("problem9 ");
			System.out.println("---------");

		 problem9();
			System.out.println(" ");
		System.out.println("problem 10   ");
		System.out.println("---------");

		problem10();
		System.out.println(" ");
		
		System.out.println("problem 11   ");
		System.out.println("---------");

		problem11();
		System.out.println(" ");

	}
		static void bool()
		{
			int a = -4;
			int  b = 0;
			boolean x = a< -5 && b==4;
			boolean y = --a > -6 || b-- < -1;
			System.out.println("a : "+(a));
			System.out.println("b: "+(b));
			System.out.println("x : "+(x));
			System.out.println("y : "+(y));

			
			
		}
		static void problem9()
		{
			int a = -1;
			int b = 1;
			boolean x = ++a<=0 && ++b>1;
			boolean y = --a > -2 || b-- < 1;
			System.out.println("a : "+(a));
			System.out.println("b: "+(b));
			System.out.println("x : "+(x));
			System.out.println("y : "+(y));
		}
		static void problem10()
		{
			int a = -1;
			boolean x = a!=-2 && ++a==0;
			System.out.println("a : "+(a));
			System.out.println("x : "+(x));
		}
		static void problem11()
		{
			int x = 9;
			System.out.println("result: "+(x==9 && ++x!=9)); 
		}
		
}
