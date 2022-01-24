package org.la.core.java.student.datatype.Sahil;

public class c67 {
	 public static void main(String[] args) {

	        int numMax = 30;

	        int i;
	        for (int num = 2; num < numMax; num++) {

	            for (i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    break;
	                }
	            }
	            if (i == num) {
	                System.out.println(num + " is a prime number");
	            }
	        }
	    }
}
