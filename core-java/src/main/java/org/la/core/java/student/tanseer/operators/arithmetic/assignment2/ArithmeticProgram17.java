package org.la.core.java.student.tanseer.operators.arithmetic.assignment2;

public class ArithmeticProgram17 {

	public static void main(String[] args) 
	{
		int a = 31, b = 40;
		int c = b - a;
		
		b = c % a;    
		System.out.println("b = " +b);
		
		b = b / a;   
		System.out.println("b = " +b);
		
		a = ++c;        
		System.out.println("a = " +a);
		System.out.println("c = " +c);
		
		//b = (a - --b);
		//System.out.println("b = " +b);

		b = (a - --b) * c;
		System.out.println("b = " +b);
		

	}

}
