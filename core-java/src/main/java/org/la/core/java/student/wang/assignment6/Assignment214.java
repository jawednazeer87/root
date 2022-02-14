package org.la.core.java.student.wang.assignment6;

public class Assignment214 {
    /*
	214
14- What will be the output of the following program.
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
       // c = a + b; here c did not define
    }
}
/*
Compilation Error
 */