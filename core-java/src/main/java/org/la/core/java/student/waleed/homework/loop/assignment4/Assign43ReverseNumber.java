package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign43ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = 12345;
		int k =0;
		
		for(; n>0 ;) {
			int r = n % 10;
			n = n / 10;
			k = k * 10 + r;
		}
		
		System.out.println("reverse num: "+k);
		
	}

}
