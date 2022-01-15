package org.la.core.java.student.arfaz.assignment_6;


public class MethodTest9
{
    public static void main(String s[])
    {
        float m = 34;
        float n = 56;
        float o = sum(m, n);
        System.out.println("o = " + o);
    }
    
    public static void sum(float m, float n)
    {
        System.out.println("m = " + m + " n = " + n);
        return m + n;
    }
}