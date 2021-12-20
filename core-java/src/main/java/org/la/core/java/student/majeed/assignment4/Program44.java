package org.la.core.java.student.majeed.assignment4;

public class Program44 {

	public static void main(String[] args) {
		// 44.	wap to find sum of a number e.g ip=1234,  op=10	
		int ip = 1234, sum = 0;
		while(ip>0) {
			sum = sum + (ip%10);
			ip = ip/10;
			
		}
		
		System.out.println(sum);
	}

}
