package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CheckOutput34 {

	public static void main(String[] args) {
		int a = 27 / 4 + 9;
        int b = 52 / 6 - 3;
        int c = 3;
        c = a++ - b; 
        a = a * b; 
        b = b + a; 
        a = (a < c) ? a % c : c % a; 
        System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
}
