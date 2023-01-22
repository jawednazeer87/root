package org.jn.core.java.student.mirza.baig.loop;

import java.util.Scanner;

public class NumberEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int N=sc.nextInt();
		for (int i =0; i<=N; i++) {
			
			if (i%2==0) {
				
				sum+=i;
				
			}
			
		}
		
		System.out.println("sum of all even numbers between 1 to n "+N +" = " +sum);

        }
	}






// Wap to find sum of all even numbers between 1 to n.