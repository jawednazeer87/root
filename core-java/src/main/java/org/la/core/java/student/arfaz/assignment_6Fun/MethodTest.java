package org.la.core.java.student.arfaz.assignment_6Fun;


public class MethodTest
{
    public static void main(String s[])
    {
        int a = 34;
        int b = 56;
        int c = sum(a, b);
        System.out.println("c = " + c);
    }
    
    public static int sum(int a, int b)
    {
        System.out.println("a = " + a + " b = " + b);
        return a + b;
    }
}