package org.la.core.java.student.datatype.Sahil;

public class c72 {
	  public static void main(String[] args) {


	        for (int n = 1; n <= 100; n++) { //n is range
	            int sum = 0;
	            int i = 1;
	            while (i <= n / 2) {
	                if (n % i == 0) {
	                    sum = sum + i;
	                }
	                i++;
	            }
	            if (sum == n) {
	                System.out.println(n + " is a perfect number.");
	            }
	        }
	    }
}
