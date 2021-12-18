package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment53 {
    //53.	Wap to find sum of all odd numbers between 1 to n.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2!=0)
            sum += i;
        }
        System.out.println(sum);
    }
}
