package org.jn.core.java.student.sadullah.weekly.assignment3;

public class FirstAndLastDigitOfANumber {

	public static void main(String[] args) {
		int n = 8126389, first = 0, last = 0; last = n % 10; 
		while(n != 0) { 
			first = n % 10;
			n /= 10;
		} 
		System.out.println("First digit = " + first); 
		System.out.println("Last digit = " + last); 
	} 
}