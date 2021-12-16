package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign65FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int f = 1;
		int n = 7;
		int sum = 0;
		for(; n>=1 ; n--) {
			System.out.println(f+"*"+n );
			f = f * n;
		
			sum = sum+f;
		}
		
		System.out.println("factorial: "+sum);
	}
		
		
		
	}


