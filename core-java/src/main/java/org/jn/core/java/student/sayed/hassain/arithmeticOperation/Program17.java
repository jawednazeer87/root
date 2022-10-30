package org.jn.core.java.student.sayed.hassain.arithmeticOperation;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 31, b = 40;
		int c = b - a; // a: 31 b: 40 c: 9
		b = c % a; // a: 31 b: 9 c: 9
		b = b / a; // a: 31 b: 0 c: 9
		a = ++c; // a: 10 b: 0 c: 10
		b = (a - --b) * c; // a: 10 b: -1 c: 10
							// a: 10 b: 110 c: 10

		System.out.println(" a: " + a + " b: " + b + " c: " + c);
	}

}
