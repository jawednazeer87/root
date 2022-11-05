package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class SquarOrNot {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter the length and width to check if it is a square or not.");
		
		int l = newscan.nextInt();
		int w = newscan.nextInt();
		
		if (l==w) {
			System.out.println("This is a square.");
		} else {
			System.out.println("This is a rectangle.");
		}
	}
}
