package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program23 {
	static void printInc(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program23.printInc(5);
	}

}
