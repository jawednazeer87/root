package org.la.core.java.student.majeed.assignment3;

public class Program53 {

	public static void main(String[] args) {
		//53. wap to check whether a given number is positive and double digit or single digit number 
		int i = -8;
		if (i>0) {
			System.out.println("i is positive: "+i);
			if (i > 9 && i < 100) {
				System.out.println("i is double digit");
			}
			else if (i > 0 && i < 10) {
				System.out.println("i is single digit");
				}
			else
				System.out.println("i is not single digit or not double digit");
		} else {
			System.out.println("i is negative: "+i);
			if (i < -9 && i > -100) {
				System.out.println("i is double digit");
			}
			else if (i >= -9 && i < -1) {
				System.out.println("i is single digit");
				}
			else
				System.out.println("i is not single digit or not double digit");
		}
	}

}
