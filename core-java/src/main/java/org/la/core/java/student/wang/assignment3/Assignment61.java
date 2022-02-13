package org.la.core.java.student.wang.assignment3;

public class Assignment61 {
    //      	61.	wap to print 'hello world' if number is divisible by 3 and 5, print 'hello' if divisible by 3 only,
    //      	print 'world' if number is divisible by 5.
    public static void main(String[] args) {
        int a = 15;
        if (a % 5 == 0 && a % 3 == 0) {
            System.out.println("hello world");
        } else if (a % 3 == 0) {
            System.out.println("hello");
        } else if (a % 5 == 0) {
            System.out.println("world");
        }
    }
}