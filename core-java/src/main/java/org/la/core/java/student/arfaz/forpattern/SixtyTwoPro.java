package org.la.core.java.student.arfaz.forpattern;

import java.util.Scanner;

public class SixtyTwoPro {
	public static void main(String[] args) {
		int n,rem=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(;n!=0;) {
		rem=n%10;
		System.out.print(rem);
			n=n/10;
    	
	}
	}
//	enter a number and print its reverse
}
