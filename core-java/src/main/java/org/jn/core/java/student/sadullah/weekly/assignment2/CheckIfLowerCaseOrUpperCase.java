package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckIfLowerCaseOrUpperCase {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter char to check whether lowercase or uppercase.");
		
		char letter = newscan.next().charAt(0);
		
		if ((int)letter >= 65 && (int)letter <= 90) {
			System.out.println("The letter is uppercase.");
		} else if ((int)letter >= 97 && (int)letter <= 122) {
			System.out.println("The letter is lowercase.");
		} else {
			System.out.println("Not letter");
		}
	}
}
