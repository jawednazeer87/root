package org.jn.core.java.student.mirza.baig.method;

public class RemainderTwoNumbers {
	
	public static int remainder(int a, int b) {
		
		int remainder=a%b;
		
		System.out.println("Remainder of two numbers :"+remainder);
		
		return remainder;
	}
	
	public static void main(String[] args) {
		
		
		remainder(12,23);
		remainder (6,8); 
	}

}
