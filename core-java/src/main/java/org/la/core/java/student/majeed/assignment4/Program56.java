package org.la.core.java.student.majeed.assignment4;

public class Program56 {

	public static void main(String[] args) {
		// 56.	Wap to find first and last digit of a number.
		int ip = 1234500, i = 1, firstDigit = 0, lastDigit = 0;
		while(ip>0) {
			if(i==1)
			lastDigit = ip%10;
			
			firstDigit	= ip;
			ip = ip/10;	
			
			i++;
		}		
		System.out.println("First Digit is: "+firstDigit);	
		System.out.println("Last Digit is: "+lastDigit);
		
	}

}
