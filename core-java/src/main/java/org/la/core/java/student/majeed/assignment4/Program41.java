package org.la.core.java.student.majeed.assignment4;

public class Program41 {

	public static void main(String[] args) {
		// 41.	wap to print Fibonacci series
		int i = 0, j = 0, k = 1, m = 0;
		while(i<=29) {			
			
			System.out.print(j+",");
			
			m = j + k;
			j=k;
			k=m;
			i++;
			
		}
		
	}

}
