package org.jn.core.java.student.sadullah.weekly.assignment3;
import java.util.Scanner;

public class NaturalNumbersTon {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Please enter a number to print natural number till. (Only positive numbers)");
		
		int n = newscan.nextInt();
		
		printNatural(n);
	}
	static void printNatural(int n) {
		for (int i = 1; i <= n; i++) { 
            System.out.print(i + " "); 
        } 
	}
}