package org.la.core.java.student.datatype.moshin.assignment2;

public class Que02Arithmetic17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 41, b = 70;
		int c = b - a;
		b = c % a;
		b = b / a;
		a = ++c;
		b = (a - --b) * c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	
	}

}
