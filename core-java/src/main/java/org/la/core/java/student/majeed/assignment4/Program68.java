package org.la.core.java.student.majeed.assignment4;

public class Program68 {

	public static void main(String[] args) {
		// 68.	Wap to find sum of all prime numbers between 1 to n.
        int n = 100, temp = 2, i, sum = 0;
        for (temp = 2; temp < n; temp++) {

            for (i = 2; i < temp; i++) {
                if (temp % i == 0) {
                    break;
                }
            }
            if (i == temp) {
            	sum += temp;
            }
        }
        System.out.println(sum);
	}

}
