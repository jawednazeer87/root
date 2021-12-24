package org.la.core.java.student.majeed.assignment4;

public class Program55 {

	public static void main(String[] args) {
		// 55.	Wap to count number of digits in a number.
		int ip = 12345, op = 0;
		while(ip>0) {
			op = op + 1;
			ip = ip/10;			
		}		
		System.out.println(op);		
	}

}
