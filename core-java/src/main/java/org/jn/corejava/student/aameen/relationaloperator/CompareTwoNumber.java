package org.jn.corejava.student.aameen.relationaloperator;

public class CompareTwoNumber {

	public static void main(String[] args) {
		// wap to compare two numbers and print the result, >, >=, <, <=, ==, !=
		int num1 = 32, num2 = 54;
		System.out.println("Num1 : "+num1 );
		System.out.println("Num2 : "+num2 );
		System.out.println("");
System.out.println("Comparing two number using > operator " );
System.out.println("-------------------" );

		if(num1>num2)
		{
			System.out.println("num1 is greater and num2 is smaller");
		}
		else
			System.out.println("num2 is greater and num1 is smaller ");
		
		System.out.println("");

	
System.out.println("Comparing two number using < operator ");
System.out.println("------------------------ ");
		
		if(num1<num2)
		{
			System.out.println("num1 is lesser than num2 ");
		}
		else
			System.out.println("num2 is lesser than num1");
	System.out.println(" ");
System.out.println("Comparing two number using == operator  ");
System.out.println("-------------------------- ");

		if(num1==num2)
			System.out.println("num1is equal to num2 ");
		else
			System.out.println("num1 is not equal to num2 ");
		

		

		

	}

}
