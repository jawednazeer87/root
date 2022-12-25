package org.jn.core.java.student.dawood.akram.weekly.week3;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0;
        long num = 9876543210L;
        long lastDigit;
        long remainingDigits;
        while(num!=0) {
        	lastDigit = num%10;
        	remainingDigits = num/10;
        	num = remainingDigits;
        	count++;
        }
        System.out.println("Number of digits in the given number is "+count);
	}

}
