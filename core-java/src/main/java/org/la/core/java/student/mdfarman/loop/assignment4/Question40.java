package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question40 {
	
//	40.	wap to find factorial of a given number
	
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for ( int i =1; i<=num ; i++ ) {
			fact = fact*i;
		}
		System.out.println("factorial of "+num+" : "+fact);
	}
}
