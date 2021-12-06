package org.la.core.java.student.sjmohammed.assignment3;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 65, b = 90, c = 97, d = 122;
        char e = '&';
        if (e >= 65 && e <= 90) {
            System.out.println(e + " is Uppercase ( A to Z )"); 
        } else if(e >= 97 && e <= 122) {
            System.out.println(e + "is Lowercase ( a to z )");
        }else {
            System.out.println(e + " is not lowercase ( a to z ) or uppercase ( A to Z )");
        }
	}

}
