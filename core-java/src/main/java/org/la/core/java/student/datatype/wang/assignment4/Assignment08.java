package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment08 {
    //8.	wap to print numbers which is completely divisible by 3 and 2 between 1 and 10.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
