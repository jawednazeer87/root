package org.la.core.java.student.moshin.assignment4;

public class Question082 
{
	/*
	82.
			1
			1 2
			1 2 3
	     */
	    public static void main(String[] args) {
	        int i, j, row = 3;
	        for (i = 1; i <= row; i++) {
	            for (j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println("");
	        }
    }
}

