package org.la.core.java.student.majeed.assignment4;

public class Program81 {

	public static void main(String[] args) {
		/* 81.	wap to print pattern
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
		
		*/
		int i,j;
       for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
