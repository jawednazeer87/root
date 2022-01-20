package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * Program Output.
 */
public class Question07 
{

	public static void main(String[] args)
	{
        int x = 6;
        int y = 3;
        int z = 12;

        int w = method1(x, y, z);
        
        System.out.println("w = " + w);
    }

    public static int method1(int y, int z, int x)
    {
        return (x * z) / y;
    }

}



