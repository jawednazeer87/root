package org.jn.core.java.student.sadullah.weekly.assignment3;

public class UpperCaseVowels {

	public static void main(String[] args) {
		System.out.println("All upper case vowels");
		
		for (char i = 'A'; i <= 'Z'; i++) {
			if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
				System.out.print(i +" ");
			}
		}
	}
}
