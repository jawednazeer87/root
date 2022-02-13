package org.la.core.java.student.wang.assignment3;

public class Assignment48 {
    //   48. wap to find least number among three numbers
    public static void main(String[] args) {
        int a = 1, b = 30, c = 111;
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is smallest number");
            } else {
                System.out.println(c + " is smallest number");
            }
        } else {//a>b
            if (c > b) {
                System.out.println(b + " is smallest number");
            } else {
                System.out.println(c + " is smallest number");
            }
        }
    }
}