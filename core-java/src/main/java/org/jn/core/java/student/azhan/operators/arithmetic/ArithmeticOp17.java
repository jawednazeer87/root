package org.jn.core.java.student.azhan.operators.arithmetic;

public class ArithmeticOp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println("a = "+a+", b = "+b+", c = "+c);
	}

}