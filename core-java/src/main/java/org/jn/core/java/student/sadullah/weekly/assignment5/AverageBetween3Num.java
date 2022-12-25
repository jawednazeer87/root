package org.jn.core.java.student.sadullah.weekly.assignment5;

public class AverageBetween3Num {
	static double average(int a, int b, int c) {
		int sum = a+b+c;
		double avg = sum/3;
		return avg;
	}
	
	
	public static void main(String[] argrs) {
		int a = 10, b = 30, c = 80;
		double average = average(a, b, c);
		System.out.println("The average of " +a +", " +b +" and " +c +" is " +average);
	}
}
