package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign45SumOfNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234;
		int sum =0;
		
		for(; n>0 ;) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		
		System.out.println("Sum: "+sum);
		
		
		
	}

}
