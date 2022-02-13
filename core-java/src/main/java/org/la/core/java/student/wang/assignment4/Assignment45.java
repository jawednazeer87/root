package org.la.core.java.student.wang.assignment4;

public class Assignment45 {
    //45.	wap to print patterns
    public static void main(String[] args) {

        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}