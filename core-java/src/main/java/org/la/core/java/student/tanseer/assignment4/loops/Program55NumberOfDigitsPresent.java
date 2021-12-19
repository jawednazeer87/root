package org.la.core.java.student.tanseer.assignment4.loops;

public class Program55NumberOfDigitsPresent {

	public static void main(String[] args) {
		int n = 123456778, count = 0;
		
		while(n != 0) {
			n = n / 10;
			count ++;
		}
		System.out.println("Number of digits present : "+count);
	}
}