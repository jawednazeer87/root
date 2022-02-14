package org.la.core.java.student.wang.assignment6;

public class Assignment211 {
    /*
	211
11-
What will be the output of the following program.
*/
    public static void main(String s[])
    {
        int a = 34;
        int b = 56;
        int c = sum(a, b);
        System.out.println("c = " + c);
    }

    public static int sum(int b, int a)
    {
        System.out.println("a = " + a + " b = " + b);
        return a + b;
    }
}
/*
a = 56 b = 34
c = 90
 */
