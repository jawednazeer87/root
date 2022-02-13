package org.la.core.java.student.wang.assignment4;

public class Assignment84 {

    /*
84.
	         1
	       1 2
		 1 2 3
     */
    public static void main(String[] args) {
        int i,j,row=3;
        for ( i = 1; i <= row; i++) {
            for ( j = row-1; j >=i ; j--) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}