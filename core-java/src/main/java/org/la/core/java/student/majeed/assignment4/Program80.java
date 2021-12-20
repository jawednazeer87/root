package org.la.core.java.student.majeed.assignment4;

public class Program80 {

	public static void main(String[] args) {
		/* 80.	wap to print pattern
		 
		   *
		  * *
		 * * *
		* * * *
		
		*/
		int i,j;
        for (i = 0; i < 4; i++) {
            for (j = 4 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
