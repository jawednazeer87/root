package org.jn.core.java.student.azhan.operators.ternary;

public class OddWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, b = 98;
		if(a%2!=0 && b%2==0)
			System.out.println("Odd Number = "+a);
		else if(b%2!=0 && a%2==0)
			System.out.println("Odd Number = "+b);
		else if(a%2!=0 && b%2!=0)
			System.out.println("Both are odd numbers");
		else
			System.out.println("Both are not odd numbers");
	}

}
