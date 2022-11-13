package org.jn.core.java.student.dawood.akram.weekly.week3;

public class SumOfOddNaturals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int sum = 0;
	         for(int i=1;i<=100;i++) {
	        	 if(i%2!=0) {
	        		 sum+=i;
	        	 }
	         }
	         System.out.println("Sum of all the given odd natural numbers is "+sum);
		}
	}

