package org.la.core.java.student.datatype.moshin.assignment3;

public class Question53 {

	public static void main(String[] args) {
		
		int a = 11;
        if (a > 0) {
            System.out.println(a + " is positive");
            if (a >= 0 && a <= 9) {
                System.out.println(a + " is single digit number");
            }
            if (a >= 10 && a <= 99) {
                System.out.println(a + " is double digit number");
            }
        } else {
            System.out.println(a + " is negative");
            if (a <= 0 && a >= -9) {
                System.out.println(a + " is single digit number");
            }
            if (a <= -10 && a >= -99) {
                System.out.println(a + " is double digit number");
            }
        }
 
	}

}