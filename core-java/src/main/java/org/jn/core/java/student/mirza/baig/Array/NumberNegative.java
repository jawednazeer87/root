package org.jn.core.java.student.mirza.baig.Array;

public class NumberNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] num= {1,-2,-3,4,6,-5,-8,9,10};
		
		System.out.println("all negative numbers");
		for (int i=1; i<num.length; i++) {
			
			if (num[i]<0) {
				
				System.out.println(num[i]);
			}
		}
		
	}

}
 
// wap to print only negative number from an array