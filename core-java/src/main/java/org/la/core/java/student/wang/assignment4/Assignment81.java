package org.la.core.java.student.wang.assignment4;

public class Assignment81 {

    /*
  81.
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
     */
    public static void main(String[] args) {
        int i, j, row = 4;
        for (i = 0; i < row; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}