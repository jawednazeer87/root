package org.la.core.java.student.majeed.assignment4;

public class Program69 {

	public static void main(String[] args) {
		// 69.	Wap to check whether a number is Armstrong number or not.
        int i = 407, j, sum = 0, count=0, rem = 0;
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
        } else {
            System.out.println(i + " is not Armstrong Number");
        }
	}

}
