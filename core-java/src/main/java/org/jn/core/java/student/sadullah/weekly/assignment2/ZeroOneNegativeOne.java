package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class ZeroOneNegativeOne {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int num = newscan.nextInt();
		
		if (num < 0) {
			System.out.println(-1);
		} else if (num == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
