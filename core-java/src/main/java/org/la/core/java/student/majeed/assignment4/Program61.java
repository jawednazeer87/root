package org.la.core.java.student.majeed.assignment4;

public class Program61 {

	public static void main(String[] args) {
		// 61.	Wap to enter a number and print its reverse.
		int ip = 12345, op = 0, i;
		while(ip>0) {
			i = ip%10;
			op = op*10+i;
			ip = ip/10;
			
		}
		
		System.out.println(op);
		
	}

}
