package org.la.core.java.student.tanseer.assignment4.loops;

public class Program56FirstAndLastDigit {

	public static void main(String[] args) {
		int n = 423456778 , firstDigit = 0 , lastDigit = 0;
		
		lastDigit = n % 10;
		System.out.println("Last Number :" + lastDigit);
		
		while(n != 0) {
			
			firstDigit = n % 10;	
			n /= 10;
		}
		
		System.out.println("First Number :" + firstDigit);
		
	}
}