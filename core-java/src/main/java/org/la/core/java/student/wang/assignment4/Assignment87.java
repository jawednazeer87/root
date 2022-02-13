package org.la.core.java.student.wang.assignment4;

public class Assignment87 {

    /*
87.	Number pattern programs - Wap to print the given number patterns.
		1
		2 2
		3 3 3
     */
    public static void main(String[] args) {
        int i, j, row = 3;
        for ( i = 1; i <= row; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}