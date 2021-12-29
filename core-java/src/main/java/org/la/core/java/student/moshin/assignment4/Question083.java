package org.la.core.java.student.moshin.assignment4;

public class Question083 
{
	/*
	83.
			1
			2 2
			3 3 3
	     */
	    public static void main(String[] args) {
	        int i, j, row = 3;
	        for (i = 1; i <= row; i++) {
	            for (j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println("");
	        }
    }
}

