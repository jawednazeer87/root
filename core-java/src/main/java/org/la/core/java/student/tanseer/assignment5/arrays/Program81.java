package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
 */

public class Program81 
{

	public static void main(String[] args) 
	{
		char ch = 'C';
		
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("Capital");
		}
		
		else 
			System.out.println("small");
	}	

}
