package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question63 {

//		63.	Wap to print all ASCII character with their values.

	public static void main(String[] args) {
		
		for(char i = 'a'; i<='z'; i++) {
			System.out.println(i+" = "+(int)i);
		}
		System.out.println("*******************");
		for(char i = 'A'; i<='Z'; i++) {
			System.out.println(i+" = "+(int)i);
		}
		
	}
}
