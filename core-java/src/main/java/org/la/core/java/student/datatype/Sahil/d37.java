package org.la.core.java.student.datatype.Sahil;

public class d37 {
	  public static void main(String[] args) {
	        int num = 188, temp = num;
	        int count = 0;
	        while (temp != 0) {
	            temp /= 10;
	            count++;
	        }
	        if (count == 2) {
	            System.out.println(num + " is double digit.");
	        }
	    }
}
