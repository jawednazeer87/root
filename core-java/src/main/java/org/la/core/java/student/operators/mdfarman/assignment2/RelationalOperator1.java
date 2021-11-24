package org.la.core.java.student.operators.mdfarman.assignment2;

import java.util.Scanner;

public class RelationalOperator1 {

	public static void main(String[] args) {

		//		1.	wap to compare two numbers and print the result, >, >=, <, <=, ==, !=		
		while(true) {
			int num1;    
			int num2;

			Scanner sc = new Scanner(System.in);
			System.out.print( "Input first integer: " );     
			num1 = sc.nextInt();  

			System.out.print( "Input second integer: " );        
			num2 = sc.nextInt();           
			if (num1 == 0 && num2 ==0)
			{
				System.out.println("Bye Bye");
				break;
			}
			if ( num1 == num2 )           
				System.out.println( num1 + " == " + num2 );  
			if ( num1 != num2 )          
				System.out.println( num1 + " != " + num2 );  
			if ( num1 < num2 )          
				System.out.println( num1 + " < " + num2 );    
			if ( num1 > num2 )          
				System.out.println( num1 + " > " + num2 );    
			if ( num1 <= num2 )          
				System.out.println( num1 + " <= " + num2 );  
			if ( num1 >= num2 )          
				System.out.println( num1 + " >= " + num2 );  

			

		}
		
	}

}
