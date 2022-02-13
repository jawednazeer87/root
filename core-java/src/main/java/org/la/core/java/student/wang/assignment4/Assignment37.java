package org.la.core.java.student.wang.assignment4;

public class Assignment37 {
    //37.	wap to print all numbers from 1 to 10 except 3 and 7.

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7)
                continue;
            System.out.println(i);
        }
    }
}
