package org.la.core.java.student.datatype.wang.assignment7;

public class Assignment14 {
    public static void main(String[] args) {
        byte x = 112;
        byte res = (byte)(x << 4); //111 0000 0000
        System.out.println(res); //1792    0
        int i = 1792 % 256;
        System.out.println(i);
        res--;
        System.out.println("res = " + res);
    }
}
