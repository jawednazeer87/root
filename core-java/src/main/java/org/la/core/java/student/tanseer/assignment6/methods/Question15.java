package org.la.core.java.student.tanseer.assignment6.methods;


/*
 * Program Output.
 */
public class Question15 
{

	public static void main(String[] args)
	{
		float m = 34;
        float n = 56;
        float o = sum(m, n);
        System.out.println("o = " + o);
    }
    
    public static float sum(float m, float n)
    {
        System.out.println("m = " + m + " n = " + n);
        return m + n;
    }

}



