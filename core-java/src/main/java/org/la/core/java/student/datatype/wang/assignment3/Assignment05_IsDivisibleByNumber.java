package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment05_IsDivisibleByNumber {
    //5.	wap to find whether a number is divisible by a given number completely.
    public static void main(String[] args) {
        int a = 10, b = 3;
        boolean aIsDivisibleByB = a % b == 0 ? true : false;
        System.out.println(a+" Is Divisible By "+ b +" : "+ aIsDivisibleByB);
    }
}
