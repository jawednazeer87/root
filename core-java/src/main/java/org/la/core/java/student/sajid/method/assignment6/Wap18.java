package org.la.core.java.student.sajid.method.assignment6;

public class Wap18 {

	public static void main(String[] args) {
		// double div(int, int) - divide first argument with 
		//second argument and return the result
		
		int i=10;
		int j=5;
		
		double k=reminder(i,j);
		System.out.println("reminder of two numbers and the result is: "+k);
	}
	
	static double reminder(int a,int b) {
		int c = a/b;
		return c ;
	}
}
