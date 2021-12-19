package org.la.core.java.student.sajid.looping.assignment4;

public class Wap53 {

	public static void main(String[] args) {
		int n=6;
		int sum=0;
		
		System.out.print("Sum of odd numbers from 1 to "+n+" is : ");
		
		for(int i=1;i<=n;i++) {
			
			int rem = i%2;
			
			if(rem==1) {
			sum=sum+i;
			}

		}
		System.out.print(sum);

	}

}
