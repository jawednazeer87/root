package org.la.core.java.student.sajid.method.assignment6;

public class Wap23 {

	public static void main(String[] args) {
		// 23)	void fibonocci(int)
		// print fibonacci series 

		int i = 10;
		
		fibonacci(i);
	}

	static void fibonacci(int a) {
		
		int first=0;
		int second=1;
		
		System.out.print("Fibonacci series upto "+a+" is: ");
		
		for(int i=1;i<=a;i++) {
			System.out.print(" "+first);
			int next = first+second;
			first=second;
			second=next;
		}
	}
}
