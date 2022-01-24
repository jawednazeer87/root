package org.la.core.java.student.datatype.Sahil;

public class c56 {
	 public static void main(String[] args) {

	        int num = 123345,
	                firstDigit = 0,
	                lastDigit = 0;
	        lastDigit = num % 10;

	        while (num > 9) {
	            num = num / 10;
	            firstDigit = num;
	        }
	        System.out.println("firstDigit = " + firstDigit);
	        System.out.println("lastDigit = " + lastDigit);
	    }
}
