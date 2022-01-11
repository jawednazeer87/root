package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to find greatest number among three numbers
 */

public class Program72UsingTernaryOperator 
{

	public static void main(String[] args) 
	{
		int a = 10 , b = 110 , c = 222 , max;
		
		max = 	(a > b) ?
				(a > c ? a : c):
				(b > c ? b : c);	
		
		System.out.println(max);
		
	}	

}
