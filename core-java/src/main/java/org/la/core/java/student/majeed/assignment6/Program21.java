package org.la.core.java.student.majeed.assignment6;

public class Program21 {

	public static void main(String[] args) {
		/*
		double percent(int, int, int, int, int)
		suppose 5 arguments are marks in subjects, each subject is of 100 marks,
		find percentage and return result
		 */
		double c = percent(85,95,70,95,91);
		System.out.println(c);
	}
	
	static double percent(int a, int b, int c, int d, int e) {
		double k = 0;
		k=(a+b+c+d+e)/5;
		return k;
	}	

}