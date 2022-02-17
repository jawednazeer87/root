package org.la.core.java.student.arfaz.assignment_6Fun;


public class MethodTest7
{
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
    	int c=0;
        System.out.println("a = " + a + " b = " + b);
        c = a + b;
    }
}
