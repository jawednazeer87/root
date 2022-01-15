package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
 */

public class Program80 
{

	public static void main(String[] args) 
	{
		int age = 13;
		
		if(age < 13)
			System.out.println("Kid");
		
		else if(age > 12 && age < 18)
			System.out.println("Teenage");
		
		else
			System.out.println("Adult");
	}	

}
