package org.la.core.java.student.sajid.method.assignment6;

public class Wap19 {

	public static void main(String[] args) {
		// double average(int, int, int) - find average of formal arguments and return result

		int i=2;
		int j=4;
		int k=6;
		
		double l=average(i,j,k);
		System.out.println("average of 3 numbers and the result is: "+l);
	}
	
	static double average(int a,int b,int c) {
		int sum = a+b+c;
		int d = sum/3;
		return d ;
	}

}
