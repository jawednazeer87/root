package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] a = {7, 1, 67, 15, 50, 9};
		int sum = 0;
		 for(int i=0 ; i<a.length ; i++) {
			sum+=a[i];
			}
		
		 int i;
	     for(  i=2 ; i<sum ; i++) {
	
			if(sum %i ==0) {
			break;
			}
	    }
		if(sum==i) 
		{ 
		
			System.out.println("sum : "+sum+ " is  prime number");
			
		}
	
		else
//
	  System.out.println("sum : "+sum+ " is not prime number");
		
		
		
	}
		
		
	}


