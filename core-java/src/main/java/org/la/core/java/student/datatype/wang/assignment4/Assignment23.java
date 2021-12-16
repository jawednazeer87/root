package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment23 {
    //23.	wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
    public static void main(String[] args) {

        for (int i = 10; i <= 50; i++) {
            if (i % 5 == 0 && i % 9 ==0) {
                System.out.println(i);
            }
        }
    }
}
