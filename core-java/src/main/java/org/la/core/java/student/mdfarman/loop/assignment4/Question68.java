package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question68 {
	
//		68.	Wap to find sum of all prime numbers between 1 to n.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int num = sc.nextInt();	
		int count;
		int sum = 0;
		
		for(int i = 2; i <= num ; i++) {
			count =0;
			for(int j = 1; j <=i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==2) {
				System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println("sum of prime number : "+sum);
	}
}