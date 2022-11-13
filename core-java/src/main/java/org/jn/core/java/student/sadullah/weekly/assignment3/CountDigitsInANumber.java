package org.jn.core.java.student.sadullah.weekly.assignment3;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		int count = 0, n = 23;
		
		while (n != 0)

		{

		n = n / 10;

		count++;

		}
		System.out.println("Number of digits in the number = "+count);
	}
}
