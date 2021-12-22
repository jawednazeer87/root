package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question85 {

	//		85.
//			  	1
//			  2 2
//			3 3 3


	public static void main(String[] args) {
		int i,j,row=3;
        for ( i = 1; i <= row; i++) {
            for ( j = row-1; j >=i ; j--) 
                System.out.print("  ");
            for ( j = 1; j <= i; j++) 
                System.out.print(i+" ");
            System.out.println("");
        }


	}  

}