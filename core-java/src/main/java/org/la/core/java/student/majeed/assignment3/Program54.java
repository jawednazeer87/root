package org.la.core.java.student.majeed.assignment3;

public class Program54 {

	public static void main(String[] args) {
		//54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18 
		int age = 21;
		if (age < 13)
			System.out.println("kid");
		
		if (age >= 13 && age < 18)
			System.out.println("teenage");	
		
		if (age >= 18)
			System.out.println("adult");			
	}

}
