package org.la.core.java.student.tanseer.assignment3.conditional.statements;

public class Program31 {

	public static void main(String[] args) 
	{ 
		int marks = 50;
        if( marks >= 70 )
            System.out.println("Distinction");

        if( marks < 70 && marks >= 35 )
            System.out.println("Pass");

        if( marks < 35 )
            System.out.println("Fail");

	}
		
}


