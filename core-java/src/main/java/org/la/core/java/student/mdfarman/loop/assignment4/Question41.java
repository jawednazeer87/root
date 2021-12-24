package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question41 {
	
//	41.	wap to print fibonocci series  
//	0 1 1 2 3 5 8 13
	
	public static void main(String[] args) {
		int times = 10;
		int first = 0 , second = 1;
		int temp;
		System.out.println(first);
		System.out.println(second);
		
		for ( int i =2; i<=times ; i++ ) {
			temp = first + second;
			System.out.println(temp);
			first = second;
			second = temp;
		}
	}
}
