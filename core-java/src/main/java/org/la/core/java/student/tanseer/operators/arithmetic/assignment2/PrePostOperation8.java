package org.la.core.java.student.tanseer.operators.arithmetic.assignment2;

public class PrePostOperation8 {

	public static void main(String[] args) 
	{
		int x = 3;
		int y = 2;
		int z = x++ * y++;
		
		System.out.println("Value of x : "+ x);
		System.out.println("Value of y : "+ y);
		System.out.println("Value of z : "+ z);
	}

}
