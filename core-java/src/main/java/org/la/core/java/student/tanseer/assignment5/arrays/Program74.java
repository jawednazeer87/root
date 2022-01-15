package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to find least number among three numbers
 */

public class Program74 
{

	public static void main(String[] args) 
	{
		int a = 10 , b = 110 , c = -100, min ;
		
		min = (a < b)?
				(a < c ? a : c):
					(b < c ? b : c );
		
		System.out.println("minimum is : "+min);
		
	}	

}
