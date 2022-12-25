package org.jn.core.java.student.sadullah.weekly.assignment3;

public class SwapFirstAndLastDigits {

	public static void main(String[] args) {
		int number = 9648;
		int last = number%10;
		int first = number/1000;
		int output = last*1000 + first*10 + number/10%10*100 + number/100%10;
		System.out.println(output);
	}
}
