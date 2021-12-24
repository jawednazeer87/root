package org.la.core.java.student.majeed.assignment4;

public class Program53 {

	public static void main(String[] args) {
		// 53.	Wap to find sum of all odd numbers between 1 to n.
		int n = 100, sum = 0;
		for(int i= 1;i<=n;i++) {
			if(i%2!=0)
			sum = sum + i;			
		}
		System.out.print(sum);
		
		
	}

}
