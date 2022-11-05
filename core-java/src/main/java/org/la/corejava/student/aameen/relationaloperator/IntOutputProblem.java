package org.la.corejava.student.aameen.relationaloperator;

public class IntOutputProblem {

	public static void main(String[] args) {
		// 
		int x = 9;
		System.out.println("result: "+(x==9 && ++x!=9)); 
		System.out.println(" ");

	System.out.println("Problem 12 ");
	System.out.println("-------------");

		problem12();
		System.out.println(" ");
		
		System.out.println(" Problem 13 ");
		System.out.println("---------------");
		problem13();
		System.out.println(" ");
		
		System.out.println(" Problem 14 ");
		System.out.println("---------------");
		problem14();
		System.out.println(" ");
		
		System.out.println(" Problem 15 ");
		System.out.println("---------------");
		problem15();

	}
	static void problem12()
	{
	int x = -5;
	System.out.println("result: "+(x==-5 && ++x>-5)); 
	}
	
	static void problem13()
	{
		int y = -1;
		int x = 5 * y++ ;
		System.out.println("x : "+(x));
		System.out.println("y : "+(y));
	}
		
	static void problem14()
	{
		int y = -1;
		int x = -5 * ++y ;
		System.out.println("x : "+(x));
		System.out.println("y : "+(y));
	}
	
	static void problem15()
	{
		int a=1, b=2, c=-3;
		int s = ++a + b-- + c%3 ;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("s : "+s);
	}
	
}
