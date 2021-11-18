package org.la.core.java.student.arithmetic.sajidAli.Arithmetic.Operation;

public class ArithmeticOperation17 {
	public static void main(String[] args) {
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println(a+" "+b);
	}

}
