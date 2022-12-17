package org.jn.core.java.student.sadullah.weekly.assignment5;
import java.util.Scanner;

public class CheckChar {
	static int CheckGivenChar (char c) {
		int a = 0;
		if (c >= 'A' && c <= 'Z') {
			a = 1;
		}
		else if (c >= 'a' && c<= 'z') {
			a = -1;
		}
		else {
			a = 0;
		}
		return a;
	}
	
	public static void main(String[] argrs) {
		Scanner newscan = new Scanner(System.in);
		System.out.println("Enter a char to check.");
		
		char c = newscan.next().charAt(0);
		
		int ans = CheckGivenChar(c);
		
		System.out.println(ans);
	}
}
