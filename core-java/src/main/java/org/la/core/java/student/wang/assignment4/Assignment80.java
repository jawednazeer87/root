package org.la.core.java.student.wang.assignment4;

import java.util.Scanner;

public class Assignment80 {

    /*
  80.
		   *
		  * *
		 * * *
		* * * *
     */
    public static void main(String[] args) {
        int i, j, row = 4;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}