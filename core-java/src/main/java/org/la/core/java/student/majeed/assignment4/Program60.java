package org.la.core.java.student.majeed.assignment4;

public class Program60 {

	public static void main(String[] args) {
		// 60.	Wap to calculate product of digits of a number.
		int ip = 8524, sum =1;
		while(ip>0) {
			sum = sum * (ip%10);
			ip = ip/10;
			
		}
		
		System.out.println(sum);
		
	}

}
