package org.jn.core.java.student.mirza.ifelse;

public class IfExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 50;
        if( marks >= 70 )
            System.out.println("Distinction");

        if( marks < 70 && marks >= 35 )
            System.out.println("Pass");

        if( marks < 35 )
            System.out.println("Fail");

	}

}
