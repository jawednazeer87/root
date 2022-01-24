package org.la.core.java.student.datatype.Sahil;

public class c60 {
	 public static void main(String[] args) {

	        int num = 1234, sum = 0;
	        while (num > 9) {
	            sum = num % 10 * sum;
	            num = num / 10;
	        }
	        sum = sum * num;
	        System.out.println(sum);
	    }
}
