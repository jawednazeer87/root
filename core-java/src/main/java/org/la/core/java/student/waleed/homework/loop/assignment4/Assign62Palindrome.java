package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign62Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 7007;
		int sum = 0, r;
		 int temp = n;    
	    for (;n>0;)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("It is not a palindrome");    
	     }  
		
		
		
	}


