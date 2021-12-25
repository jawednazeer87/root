package org.la.core.java.student.sajid.loop;

public class Q44 {
	public static void main(String[] args) {
		int number = 12345, sum;
		for (sum = 0; number != 0; number = number / 10) {

			sum = sum + number % 10;
		}

		System.out.println("Sum of digits: " + sum);
	}

}
