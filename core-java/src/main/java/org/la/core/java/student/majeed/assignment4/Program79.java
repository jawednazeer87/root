package org.la.core.java.student.majeed.assignment4;

public class Program79 {

	public static void main(String[] args) {
		/* 79.	wap to print pattern
		    *
		   **
	      ***
	     ****
		*
		*/
		int i,j;
        for ( i = 1; i <= 4; i++) {
            for (j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
	}

}
