package org.la.core.java.student.tanseer.assignment4.loops;

public class Program43PrimeOrNot {

	public static void main(String[] args) {
		int n = 29;
		boolean flag = true ;
		
		for(int i = 2 ;i <= n /2; i++) {
			if( n % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(" Is a Prime Number : "+ n);
		else
			System.out.println("Not a prime number : "+n);
			
		
	}
}