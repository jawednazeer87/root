package org.la.core.java.student.majeed.assignment6;

public class P45Equation1 {
	//	What will be the output of the following program? 

	public static void main(String s[])
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