package org.la.core.java.student.moshin.assignment3;

public class Question32 {

	public static void main(String[] args) {
		
		boolean a=true, b = false;
        if (a) {
            System.out.println("A");
        } else if (a && b) {
            System.out.println("A && B");
        } else {
            if (!b) {
                System.out.println("notB");
            } else {
                System.out.println("ELSE");
            }
        }
        
	}

}
