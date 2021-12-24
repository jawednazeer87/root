package org.la.core.java.student.majeed.assignment4;

public class Program43 {

	public static void main(String[] args) {
		// 43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero		
		int ip = 12345, op = 0, i;
		while(ip>0) {
			i = ip%10;
			op = op*10+i;
			ip = ip/10;
			
		}
		
		System.out.println(op);
	}

}
