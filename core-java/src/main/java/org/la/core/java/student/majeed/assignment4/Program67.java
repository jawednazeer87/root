package org.la.core.java.student.majeed.assignment4;

public class Program67 {

	public static void main(String[] args) {
		// 67.	Wap to print all Prime numbers between 1 to n.
        int n = 100, i;

        for (int temp = 2; temp < n; temp++) {

            for (i = 2; i < temp; i++) {
                if (temp % i == 0) {
                    break;
                }
            }
            if (i == temp) {
                System.out.print(temp+",");
            }
        }
		
	}

}
