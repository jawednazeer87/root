package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question67 {
	
//		67.	Wap to print all Prime numbers between 1 to n.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int num = sc.nextInt();	
		int count;
		
		
		for(int i = 2; i <= num ; i++) {
			count =0;
			for(int j = 1; j <=i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
		
	}
}