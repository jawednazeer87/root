package org.la.core.java.student.majeed.assignment6;

public class Program18 {

	public static void main(String[] args) {
		/*
		int reminder(int, int) - find remainder and return 
		 */
		int c = reminder(100,20);
		System.out.println(c);
	}
	
	static int reminder(int a, int b) {
		int k = 0;
		k=a%b;
		return k;
	}	

}