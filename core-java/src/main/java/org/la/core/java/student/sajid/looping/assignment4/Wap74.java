package org.la.core.java.student.sajid.looping.assignment4;

public class Wap74 {

	public static void main(String[] args) {
		// strong perfect numbers from 1 to n

		int n = 145;//limit
		
		System.out.println("Strong numbers from 1 to "+n+" are: ");
		
		for (int i=1;i<=n;i++) {
			
			int k = i;
			int sum = 1;
			int res = 0;
			
			while(k>0) {
				sum = 1;
				int dig = k%10;
				k/=10;	
				
				for(int j=1;j<=dig;j++) {
					sum = sum*j;					
				}	
				res = res + sum;
			}
			if (res == i) {
				System.out.println(" "+i);			
			}
		}
	  }	
	}
