package org.la.core.java.student.majeed.assignment4;

public class Program59 {

	public static void main(String[] args) {
		// 59.	Wap to calculate sum of digits of a number.
		int ip = 8524, sum = 0;
		while(ip>0) {
			sum = sum + (ip%10);
			ip = ip/10;
			
		}
		
		System.out.println(sum);
		
	}

}
