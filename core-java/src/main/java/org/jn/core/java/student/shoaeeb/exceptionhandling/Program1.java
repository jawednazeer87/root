package org.jn.core.java.student.shoaeeb.exceptionhandling;

public class Program1 {

	static void fileOpen(String args[])
	{
		try {
			int n=args.length;
			int a=45/n;
			System.out.println(a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ae");
			System.out.println("pass any value while opening");
		}
		finally {
			System.out.println("clossing files");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileOpen(args);
	}	

}
