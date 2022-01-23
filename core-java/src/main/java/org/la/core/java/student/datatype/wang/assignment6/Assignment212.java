package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment212 {
    /*
	212
12- What will be the output of the following program.
*/
    public static void main(String s[])
    {
        int a = 34;
        int b = 56;
        sum(a, b);
       // System.out.println("c = " + c); c didnot define
    }

    public static int sum(int a, int b)
    {
        System.out.println("a = " + a + " b = " + b);
        int c = a + b;
        return c;
    }
}
/*
Compilation Error
 */