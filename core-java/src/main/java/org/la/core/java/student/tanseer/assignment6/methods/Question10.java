package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * Program Output.
 */
public class Question10 
{

	public static void main(String[] args)
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



