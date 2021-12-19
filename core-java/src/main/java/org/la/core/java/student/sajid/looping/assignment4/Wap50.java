package org.la.core.java.student.sajid.looping.assignment4;

public class Wap50 {

	public static void main(String[] args) {
		int n=100;
		
		System.out.println("Odd numbers from 1 to "+n+" are :");
		
		for(int i=1;i<=n;i++) {
			
			int rem = i%2;
			
			if(rem==1) {
			System.out.print(" "+i);
			}
		}

	}

}
