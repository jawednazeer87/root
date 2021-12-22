package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question54 {

	//		54.	Wap to print multiplication table of any number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print Table : ");
		int num = sc.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" X "+i+" = "+ i*num);
		}
	}
}
