package org.jn.core.java.student.sayed.hassain.relationalOperator;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wap to compare two numbers and print the result, >, >=, <, <=, ==, !=

		// declare two numbers to compare

		int num1 = 324, num2 = 243;

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		} else if (num1 >= num2) {
			System.out.println(num1 + " is greater than equal to " + num2);
		} else if (num1 <= num2) {
			System.out.println(num1 + " is less than equal to " + num2);
		} else if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		} else {
			System.out.println(num1 + " is not equal to " + num2);
		}

	}

}
