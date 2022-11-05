package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class Between100And200 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int num = newscan.nextInt();
		
		if (num >100 && num <200) {
			System.out.println(100);
		}else {
			System.out.println(0);
		}
	}
}
