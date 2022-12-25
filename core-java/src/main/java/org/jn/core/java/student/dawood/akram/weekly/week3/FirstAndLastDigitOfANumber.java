package org.jn.core.java.student.dawood.akram.weekly.week3;

public class FirstAndLastDigitOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 78645892;
        int count = 0;
        int lastDigit = 0;
        int remainingDigits;
        while(num!=0) { 	
        	lastDigit = num%10;
        	remainingDigits = num/10;
        	num = remainingDigits;
        	count++;
        	if(remainingDigits==0) {
        		System.out.println("First Digit of the given number is : "+lastDigit);
        	}
        	else if(count==1) {
        		System.out.println("Last Digit of the given number is : "+lastDigit);     
            }
        }
	}
}
