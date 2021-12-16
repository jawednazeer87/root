package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign61PrintReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n = 9754;
		int rev =0;
		
		for(; n>0 ;) {
			int a = n % 10;
			n = n / 10;
			rev = rev * 10 + a;
		}
		
		System.out.println("Reverse Num: "+rev);
		
	}
		
		
	}


