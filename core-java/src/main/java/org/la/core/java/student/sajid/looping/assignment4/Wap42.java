package org.la.core.java.student.sajid.looping.assignment4;

public class Wap42 {

	public static void main(String[] args) {
		
		int times = 6;
		int first = 0;
		int second = 1;
		
		System.out.println("Fibonacci series for "+times+" times");
		
		for (int i=1;i<=times;i++) {
			System.out.print(first+" ");
			
			int next = first+second; 
			first = second;
			second = next;						
						
		}

	}

}
