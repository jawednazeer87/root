package org.jn.core.java.student.dawood.akram.weekly.week3;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=12345;
        int lastDigit;
        int remDigits;
        String rev = "";
        int count=0;
        while(num!=0) {
        	lastDigit = num%10;
        	remDigits = num/10;
        	num = remDigits;
        	rev = rev+lastDigit;
        }
       if(rev.equals("54321")){
        System.out.println("Reverse of a given number is : "+rev);
       }
	}
	

}
