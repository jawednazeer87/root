package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question65 {
	
//	65.	Wap to calculate factorial of a number.
	
	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		for ( int i =1; i<=num ; i++ ) {
			fact = fact*i;
		}
		System.out.println("factorial of "+num+" : "+fact);
		
	}
}
