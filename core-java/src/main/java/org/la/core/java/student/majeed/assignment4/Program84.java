package org.la.core.java.student.majeed.assignment4;

public class Program84 {

	public static void main(String[] args) {
		/* 84.	wap to print pattern
	         1
	       1 2
		 1 2 3		    	
		*/
        int i =1,j=1,k=3;
        for ( i = 1; i <= k; i++) {
            for ( j = k-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }		
	}

}
