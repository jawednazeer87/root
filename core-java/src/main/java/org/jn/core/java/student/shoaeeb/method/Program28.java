package org.jn.core.java.student.shoaeeb.method;

public class Program28 {

	static void  printPattern(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(4);
	}

}
