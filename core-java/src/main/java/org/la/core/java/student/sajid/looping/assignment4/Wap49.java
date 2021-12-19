package org.la.core.java.student.sajid.looping.assignment4;

public class Wap49 {

	public static void main(String[] args) {
		int n=100;
		
		System.out.println("Even numbers from 1 to "+n+" are :");
		
		for(int i=1;i<=n;i++) {
			
			int rem = i%2;
			
			if(rem==0) {
			System.out.print(" "+i);
			}
		}

	}

}
