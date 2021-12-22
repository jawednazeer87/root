package org.la.core.java.student.majeed.assignment4;

public class Program70 {

	public static void main(String[] args) {
		// 70.	Wap to print all Armstrong numbers between 1 to n.
		
		int num = 2000, k;
		
		for(k = 0; k<=num; k++) {
		
        int i = k, j, sum = 0, count=0, rem = 0;
        j = i;
        while (j>0){
            j = j /10;
            count++;
        }
        j = i;
        while (j > 0) {
            rem = j % 10;
            sum += Math.pow(rem, count);
            j = j / 10; 
        }
        if (i == sum) {
            System.out.println(i + " is Armstrong Number");
        } 
		}
	}

}
