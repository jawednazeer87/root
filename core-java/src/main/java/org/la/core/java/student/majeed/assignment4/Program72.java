package org.la.core.java.student.majeed.assignment4;

public class Program72 {

	public static void main(String[] args) {
		// 72.	Wap to print all Perfect numbers between 1 to n.
		
		for(int num = 1; num <= 10000; num++) {
        int n = num, sum = 0, i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } 
		}
	}

}
