package org.la.core.java.student.tanseer.assignment2.operators.arithmetic;

public class RelationalOperation5 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

	}
}