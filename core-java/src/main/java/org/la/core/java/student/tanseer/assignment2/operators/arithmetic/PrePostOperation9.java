package org.la.core.java.student.tanseer.assignment2.operators.arithmetic;

public class PrePostOperation9 {

	public static void main(String[] args) 
	{
		int x = -1;
		int y = 2;
		int z = --x * y++;
		
		System.out.println("Value of x : "+ x);
		System.out.println("Value of y : "+ y);
		System.out.println("Value of z : "+ z);
	}

}