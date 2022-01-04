package org.la.core.java.student.sajid.looping.assignment4;

public class Wap73 {

	//Program to check given number is strong number or not
	public static void main(String[] args) {
		int n = 40585;
		int tmp = n;
		int res = 0;				
		
		while(n!=0) {
			
			int dig = n%10;
			n/=10;
			int sum = 1;
			
			for(int i=1;i<=dig;i++) {
				sum = sum*i;
			}
			res = res + sum;
			System.out.println("res: "+res);			
		}
		
		
		if (res == tmp) {
			System.out.println("Given number"+tmp+" is a strong number");
		}else {
			System.out.println("Given number"+tmp+" is not a strong number");
		}
			
	}

}
