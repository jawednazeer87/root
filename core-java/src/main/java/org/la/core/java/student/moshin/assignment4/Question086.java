package org.la.core.java.student.moshin.assignment4;

public class Question086 
{
	/*
	86. Star pattern programs - Wap to print the given star patterns.
	*
	**
	***
	****
	     */
	    public static void main(String[] args) {
	        int i, j, row = 4;
	        for ( i = 0; i <= row; i++) {
	            for ( j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	    }
}

