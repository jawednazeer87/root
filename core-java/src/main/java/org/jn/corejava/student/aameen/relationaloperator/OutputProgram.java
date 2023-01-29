package org.jn.corejava.student.aameen.relationaloperator;

public class OutputProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2, c=-3;
		int s = a++ + b-- - c++ ;
		System.out.println("Problem 16 ");
		System.out.println("--------------");
		System.out.println("a : " +a);
		System.out.println("b : " +b);		
		System.out.println("s : " +s);
		System.out.println(" ");
		
		System.out.println("Problem 17 ");
		System.out.println("--------------");
		prob17();
		System.out.println(" ");
		System.out.println("Problem 18");
		System.out.println("-----------");
		prob18();
		System.out.println("");
		System.out.println("Problem19 ");
		System.out.println("-----------------");
		prob19();
	}
	static void prob17()
	{
		int a=1, b=2, c=-3;
		int s = a++ + b-- * c++ ;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : " +c);
		System.out.println("s : " +s);
	}
	static void prob18()
	{
		boolean x = false, y = true;
		boolean r = x==false;
		boolean p = y!=true;
		System.out.println("x : "+x);
		System.out.println("r : "+r);
		System.out.println("p : "+p);
	}
	static void prob19()
	{
		boolean x = false, y = true;
		boolean r = x==true;
		boolean p = y==true;
		System.out.println("x : "+x);
		System.out.println("r : "+r);
		System.out.println("p : "+p);
	}
}
