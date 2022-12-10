package org.jn.core.java.student.sadullah.weekly.assignment5;

public class SubtractTwoNum {
	static int sub(int a, int b) {
		int c = a -  b;
		return c;
	}
	
	public static void main(String[] argrs) {
		int a = 30, b = 20;
		int c = sub(a, b);
		
		System.out.println("The difference of " +a  +" and " +b + " is " +c);
	}
}
