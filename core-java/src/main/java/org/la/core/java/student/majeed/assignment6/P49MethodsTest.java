package org.la.core.java.student.majeed.assignment6;

public class P49MethodsTest {
	//	What will be the output of the following program? 

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