package org.la.core.java.student.arfaz.assignment_6;


public class MethodTest3
{
    public static void main(String s[])
    {
        int a = 34;
        int b = 56;
        int c = 0;
        sum(a, b);
        System.out.println("c = " + c);
    }
    
    public static int sum(int a, int b)
    {
        System.out.println("a = " + a + " b = " + b);
        int c = 0;
        c = a + b;
        System.out.println("c = " + c);
        return c;
    }
}