package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question55 {

	//		55.	Wap to count number of digits in a number. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To count digit : ");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0) {
			int rem = num%10;
			if(rem!=0) {
				count++;
			}
			num = num/10;
		}
		System.out.println(count);
	}
}
