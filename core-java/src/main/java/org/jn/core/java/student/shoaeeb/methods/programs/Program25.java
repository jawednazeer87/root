package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program25 {
	//print star reverse
	static void printPattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program25.printPattern(5);
	}

}
