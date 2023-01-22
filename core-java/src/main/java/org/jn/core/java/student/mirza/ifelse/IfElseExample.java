package org.jn.core.java.student.mirza.ifelse;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean male = false;
        int age = 30;
        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");
        else
            if( age < 20 )
                System.out.println("Girl");
            else
                System.out.println("Woman");
	}

}
