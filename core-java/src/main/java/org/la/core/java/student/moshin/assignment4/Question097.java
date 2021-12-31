package org.la.core.java.student.moshin.assignment4;

public class Question097 
{
	/*
	97.	int a = 31, b = 40;
	        int c = b - a;
	        b = c % a;
	        b = b / a;
	        a = ++c;
	        b = (a - --b) * c;
	     */
	    public static void main(String[] args) {
	        int a = 31, b = 40;
	        int c = b - a; //40-31=9

	        b = c % a; //9%31=9

	        b = b / a;//9/31 = 0

	        a = ++c;//10

	        b = (a - --b) * c;//(10-(-1))*10 =11*10=110

	        System.out.println("b = " + b);
	  }
}

