package org.la.core.java.student.tanseer.assignment8.classes;

public class ArithmeticMain 
{
	public static void main(String[] args) 
	{
		Arithmetic a = new Arithmetic();
		int sum = a.add(10, 20, 30);
		System.out.println("sum : "+sum);
		int sub = a.sub(10, 30, 20);
		System.out.println("sub : "+sub);
		int div = a.div(10, 5);
		System.out.println("div : "+div);
		int prod = a.prod(10, 2);
		System.out.println("prod : "+prod);
		a.fibonacci(5);
		System.out.println();
		a.factorial(5);
		System.out.println();
		a.prime(23);
		
		
	}
}
