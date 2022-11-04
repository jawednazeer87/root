package org.jn.core.java.student.azhan.operators.ternary;

public class EvenWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, b = 8;
		if(a%2==0 && b%2!=0)
			System.out.println("Even Number = "+a);
		else if(b%2==0 && a%2!=0)
			System.out.println("Even Number = "+b);
		else if(a%2==0 && b%2==0)
			System.out.println("Both are even numbers");
		else
			System.out.println("Both are not even numbers");
	}

}
