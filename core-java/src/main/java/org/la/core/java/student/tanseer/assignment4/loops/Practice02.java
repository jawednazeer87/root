package org.la.core.java.student.tanseer.assignment4.loops;


public class Practice02 
{
	public static void main(String[] args) 
	{
		ProductOfThree(2, 6, 7);
	}

	public static void ProductOfThree(int a, int b, int c)
	{
		int prod = 0;
		
		if(c == 7)
		{
			prod = -1;
			System.out.println(prod);
		}	
		else if(b == 7)
		{
			prod = c;
			System.out.println(prod);
		}
		else if(a == 7)
		{
			prod = b * c;
			System.out.println(prod);
		}
		
		else
		{
			prod = a * b * c;
			System.out.println(prod);
		}
		
	}
	
}