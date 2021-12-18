package org.la.core.java.student.tanseer.assignment4.loops;

public class Program57SumOfFirstAndLastDigits {

	public static void main(String[] args) {
		int  num = 9535, lastDigit, firstDigit = 0;
		
		lastDigit = num % 10;
		System.out.println("Last Digit : "+lastDigit);
		
		for(; num != 0 ; ) {
			firstDigit = num % 10 ;
			num = num / 10;
		}
		System.out.println("First Digit : "+firstDigit);
		
		int sum = firstDigit + lastDigit ;
		System.out.println("Sum of last and First digits : "+sum);
		
//		
	}
}