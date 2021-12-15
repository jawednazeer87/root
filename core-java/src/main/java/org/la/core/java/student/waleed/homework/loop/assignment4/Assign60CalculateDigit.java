package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign60CalculateDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int n =923;
		int product= 1;
		for(;n>0;) {
			int r= n%10;
			product = product * r;
			n=n/10;
			
		}
			System.out.println("Product = "+ product);
			
			
		
	}

}
