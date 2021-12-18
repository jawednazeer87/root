package org.la.core.java.jawed.loop;

import java.util.Scanner;

public class ExitControlExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = 'n';
		do {
			System.out.println("Please enter a char: ");
			c = sc.next().charAt(0);
	        System.out.println("You entered char: " + c);
		}
		while(c=='y');
		System.out.println("End");
	}
}