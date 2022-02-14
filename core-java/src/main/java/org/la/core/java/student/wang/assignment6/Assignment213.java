package org.la.core.java.student.wang.assignment6;

public class Assignment213 {
    /*
	213
13-  What will be the output of the following program.
*/
    public static void main(String s[])
    {
        int a = 34;
        int b = 56;
        int c = 0;
        sum(a, b);
        System.out.println("c = " + c);
    }

    public static void sum(int a, int b)
    {
        System.out.println("a = " + a + " b = " + b);
        int c = a + b;
    }
}
/*
a = 34 b = 56
c = 0
 */