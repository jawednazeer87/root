package org.la.core.java.student.sajid.looping.assignment4;

public class Wap75 {

	public static void main(String[] args) {
		int n = 20;
		
		int first=0;
		int second=1;
		
		System.out.print("Fibonacci series upto "+n+" is: ");
		
		for(int i=1;i<=n;i++) {
			System.out.print(" "+first);
			int next = first+second;
			first=second;
			second=next;
		}
		
	}

}
