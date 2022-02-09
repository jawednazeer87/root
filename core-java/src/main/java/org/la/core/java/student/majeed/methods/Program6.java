package org.la.core.java.student.majeed.methods;

/* wap to print pattern

		   *
		  * *
		 * * *
		* * * *

*/

public class Program6 {

	public static void main(String[] args)
    {
	  pattern(5);
    }

 public static void pattern(int num) {
		int i,j;
        for (i = 0; i < num; i++) {
            for (j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	
 }