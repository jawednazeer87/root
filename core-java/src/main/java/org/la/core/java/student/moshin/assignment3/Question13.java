package org.la.core.java.student.moshin.assignment3;

public class Question13 {

	public static void main(String[] args) {
		
		char a = 65, b = 90, c = 97, d = 122;
        char e = '!';
        if (e >= 65 && e <= 90 || e >= 97 && e <= 122) {
            System.out.println(e + " is lowercase ( a to z ) or uppercase ( A to Z )");
        } else {
            System.out.println(e + " is not lowercase ( a to z ) or uppercase ( A to Z )");
        }
        
	}

}
