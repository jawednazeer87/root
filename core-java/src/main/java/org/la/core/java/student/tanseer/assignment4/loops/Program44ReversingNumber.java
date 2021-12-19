package org.la.core.java.student.tanseer.assignment4.loops;

public class Program44ReversingNumber {

	public static void main(String[] args) {
		int num = 456789 , reversed = 0;
		
		while(num != 0) {
			int digit = num % 10 ;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number is : "+reversed);

//		Using For Loop
		
		for(; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("Reversed Number is : "+reversed);
	}
}