package org.la.core.java.student.majeed.assignment4;

public class Program86 {

	public static void main(String[] args) {
		/* 86.	Star pattern programs - Wap to print the given star patterns.
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
