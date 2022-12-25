package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter age to check whether kid, teenage or adult.");
		
		int age = newscan.nextInt();
		
		if (age >0 && age <13) {
			System.out.println("Kid");
		} else if (age > 12 && age < 18) {
			System.out.println("Teenage");
		} else if (age > 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Wrong age");
		}
	}
}
