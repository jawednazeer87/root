package org.jn.core.java.student.mirza.ifelse;

public class IfExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 80;
        if( marks > 70 )
        {
            System.out.println("Distinction");
            System.out.println("Congratulations");
        }
        else if( marks > 35 )
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
            System.out.println("Better luck next time");
        }

	}

}
