package org.la.core.java.student.moshin.assignment4;

public class Question088 
{
	/*
	88.	wap to print number as char and its ascii value
	     */
	    public static void main(String[] args) {
	        int i, j, row = 3;
	        for ( i = 1; i <= row; i++) {
	            for ( j = 1; j <= i; j++) {
	                System.out.print((char)i+'0');
	            }
	            System.out.println("");
	        }
	        for ( i = 1; i <= row; i++) {
	            for ( j = 1; j <= i; j++) {
	                System.out.print(i+" ");
	            }
	            System.out.println("");
	        }
	    }
}

