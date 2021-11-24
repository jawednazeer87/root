package org.la.core.java.student.operators.arithmetic.majeed;

public class ArithmeticProgram17 {

	public static void main(String[] args) {
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
		System.out.println("a = " +a );
        System.out.println("b = " +b );
        System.out.println("c = " +c );

	}

}
