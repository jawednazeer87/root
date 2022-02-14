package org.la.core.java.student.wang.assignment7;

public class Assignment15 {
    public static void main(String[] args) {
        byte x = 99;
        byte res = (byte)(x << 5); //110001100000
        System.out.println(res); //1792    0
        int i = 3168 % 256;
        System.out.println("i = " + i);
    }
}
