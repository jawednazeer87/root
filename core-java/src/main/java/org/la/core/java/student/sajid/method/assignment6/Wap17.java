package org.la.core.java.student.sajid.method.assignment6;

public class Wap17 {

	public static void main(String[] args) {
		// int reminder(int, int) - find remainder and return 
		
		int i=10;
		int j=5;
		
		int k=reminder(i,j);
		System.out.println("reminder of two numbers and the result is: "+k);
	}
	
	static int reminder(int a,int b) {
		int c = a/b;
		return c ;
	}
}
