package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class Hi0Bye100 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int num = newscan.nextInt();
		
		if (num == 0) {
			System.out.println("Hi");
		} else if (num == 100) {
			System.out.println("Bye");
		} else {
			System.out.println("Error");
		}
	}
}
