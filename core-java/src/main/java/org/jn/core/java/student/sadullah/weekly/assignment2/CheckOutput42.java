package org.jn.core.java.student.sadullah.weekly.assignment2;

public class CheckOutput42 {

	public static void main(String[] args) {
		boolean a, b, c;
        a = b = c = true;
        if( !a || ( b && c ) )
        {
            System.out.println("If executed");
        }
        else
        {
            System.out.println("else executed");
        }
	}
}
