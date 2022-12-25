package org.jn.core.java.student.sadullah.weekly.assignment5;

public class DivisionBetweenTwoNum {
	static double div(int a, int b) { 
		double ans = a/b;
		return ans;
	}
	
	
	public static void main(String[] argrs) {
		int a = 5, b =2;
		double c = div(a, b);
		
		System.out.println(a +"/" +b +" = "+c);
	}
}
