package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign58SwapfistLastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =987653;
	       int count= 0;
		   int firstNumber = 0, lastNumber = 0;
			lastNumber = n % 10;
			int k =n;
			System.out.println("LastNumber = "+ lastNumber);
			for(; n>=10 ;) {
				firstNumber= n/10;
				n = n / 10;
		 	    count++;
			}
			System.out.println("Count = "+ count);
			 n =k;
			System.out.println("FirstNumber = "+ firstNumber);
			int p = (int) Math.pow(10, count-1);
			System.out.println("p = "+ p);
			n = n / 10;
			int mid = n % p;
			
			System.out.println("Mid = "+ mid);
			int x = firstNumber + mid*10 + lastNumber * (int)(int) Math.pow(10, count);
			System.out.println("SwapNumber ="+x);
	}

}
