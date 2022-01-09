package org.la.core.java.student.majeed.assignment6;

public class Program20 {

	public static void main(String[] args) {
		/*
		double average(int, int, int) - find average of formal arguments and return result
		 */
		int c = average(110,20,50);
		System.out.println(c);
	}
	
	static int average(int a, int b, int c) {
		int k = 0;
		k=(a+b+c)/3;
		return k;
	}	

}