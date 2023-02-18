package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program26 {
	static void printPattern(int n)
	{
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program26.printPattern(5);
	}

}
