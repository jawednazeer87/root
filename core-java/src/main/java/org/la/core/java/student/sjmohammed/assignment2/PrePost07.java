package org.la.core.java.student.arithmetic.SjMohammed;

public class PrePost07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b=--a;
		System.out.println("a = "+ a+" b = "+ b);
		a = 15;
		b = a--;
		System.out.println("A "+ a +" B " +b);
		a=2;b=--a;
		int c = a * b;
		System.out.println(c);
		a=2;b=a--;
		c = a * b;
		System.out.println(c);
		
	}

}
