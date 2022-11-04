package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter your marks to find out your grade.");
		
		int marks = newscan.nextInt();
	
		if (marks > 80) {
			System.out.println("A");
		} else if (marks > 60 && marks <= 80) {
			System.out.println("B");
		} else if (marks > 50 && marks <=60) {
			System.out.println("C");
		} else if (marks > 45 && marks <= 50) {
			System.out.println("D");
		} else if (marks > 25 && marks <= 45) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
	}
}
