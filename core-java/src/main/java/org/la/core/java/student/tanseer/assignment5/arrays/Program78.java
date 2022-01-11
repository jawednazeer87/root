package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
 */

public class Program78 
{

	public static void main(String[] args) 
	{
		char ch = 'R';
		
		if(ch >= '0' && ch <= '9') 
		{
			System.out.println("Num");
		}
		else
			System.out.println("Not Number");
	}	

}
