package org.la.core.java.student.tanseer.assignment4.loops;

public class Program45SumOfNumbers {

	public static void main(String[] args) {
		int num = 12345, sum = 0 ;
		
		for(;num != 0 ; num /= 10) {
			int dig = num % 10 ;
			sum = sum + dig;	
		}
		System.out.println("Sum of numbers is : "+sum);	
	}
}