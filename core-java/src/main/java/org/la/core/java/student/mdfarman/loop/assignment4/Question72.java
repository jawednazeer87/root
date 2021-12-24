package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question72 {

	//		72.	Wap to print all Perfect numbers between 1 to n.

	public static void main(String[] args) {

		int sum=0;  
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		int n=sc.nextInt();
		sc.close();
		int i=1;  
		while(i <= n/2){  
			if(n % i == 0){  
				sum = sum + i;  
			} 
			i++;  
		}
		if(sum==n)  
			System.out.println(n+" is a perfect number.");  
		 
		else  
			System.out.println(n+" is not a perfect number.");   

	}
}