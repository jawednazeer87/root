package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment79 {

    /*
  79.
		    *
		   **
	      ***
	     ****
     */
    public static void main(String[] args) {
        int i,j,row = 4;
        for ( i = 1; i <= row; i++) {
            for (j = row; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}