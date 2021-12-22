package org.la.core.java.student.majeed.assignment4;

public class Program85 {

	public static void main(String[] args) {
		/* 85.	wap to print pattern
			 1
	       2 2
		 3 3 3		    	
		*/
        int i =1,j=1,k=3;
        for ( i = 1; i <= k; i++) {
            for ( j = k-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }		
	}

}
