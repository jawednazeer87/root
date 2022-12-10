package org.jn.core.java.student.sadullah.weekly.assignment5;

public class RemainderBetweenTwoNum {
	static int reminder(int a, int b) {
		int c = a % b;
		return c;
	}
	
	public static void main(String[] argrs) {
		int a = 3, b = 5;
		int c = reminder(a, b);
		
		System.out.println("The remainder between " +a  +" and " +b + " is " +c);
	}
}
