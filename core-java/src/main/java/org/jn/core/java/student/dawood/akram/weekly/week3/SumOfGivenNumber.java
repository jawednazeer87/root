package org.jn.core.java.student.dawood.akram.weekly.week3;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 12345;
         int lastDigit;
         int remDigits;
         int sum = 0;
         while(num!=0) {
        	 lastDigit = num%10;
        	 remDigits = num/10;
        	 num = remDigits;
        	 sum = sum+lastDigit;
         }
         System.out.println("Sum of the Digits of a given number is : "+sum);
	}

}
