package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment78 {

    /*
   78.
		****
		 ***
		  **
		   *
     */
    public static void main(String[] args) {
        int i,j,row = 4;
        for ( i = row; i >= 1; i--) {
            for ( j = row; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}