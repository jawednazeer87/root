package org.la.core.java.student.sjmohammed.assignment2;

public class Example20 {

	public static void main(String[] args) {
		int a =31, b=40;
		int c = b-a;
		b= c%a;
		System.out.println("B ="+b);
		b=b/a;
		System.out.println("B ="+b);
		a=++c;
		System.out.println("a ="+a);
		b=(a- --b)*c;
		System.out.println("B ="+b);

	}

}
