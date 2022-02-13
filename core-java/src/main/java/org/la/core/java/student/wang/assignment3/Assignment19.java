package org.la.core.java.student.wang.assignment3;

public class Assignment19 {
    public static void main(String[] args) {
        int a = 7 * 3 + 6 / 2 - 5;  //19
        int b = 21 - 8 + a % 3 * 11; //24
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        if(a == b)
        {
            System.out.println("A is equal to B");
        }
        if(a > b)
        {
            System.out.println("A is greater than B");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
