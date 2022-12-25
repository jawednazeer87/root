package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckIfCaps {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a char to check for caps.");
		
		char l = newscan.next().charAt(0);
		
		if ((int) l >= 65 && (int) l <=90) {
			System.out.println("up");
		} else {
			System.out.println("Error");
		}
	}
}
