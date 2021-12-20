package org.la.core.java.student.moshin.assignment3;

public class Question31 {

	public static void main(String[] args) {
		
		int marks = 50;
        if( marks >= 70 )
            System.out.println("Distinction");

        if( marks < 70 && marks >= 35 )
            System.out.println("Pass");

        if( marks < 35 )
            System.out.println("Fail");
    }

}
