package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment70 {
    //70.	Wap to print all Armstrong numbers between 1 to n.

    public static void main(String[] args) {

        int i, N = 100000;
        for (i = 0; i < N; i++) {
            int num = i, sum = 0, temp = num;
            while (num != 0) {
                int remainder = num % 10;//r=3;
                sum += Math.pow(remainder, 3);
                num = num / 10; //result =15;
            }
            if (temp == sum) {
                System.out.println(temp + " is ArmstrongNumber");
            }
        }
    }
}