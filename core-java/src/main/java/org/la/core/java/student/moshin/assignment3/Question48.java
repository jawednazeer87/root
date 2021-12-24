package org.la.core.java.student.moshin.assignment3;

public class Question48 {

	public static void main(String[] args) {
		
		int a = 451, b = 370, c = 111;
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is smallest number");
            } else {
                System.out.println(c + " is smallest number");
            }
        } else {//a>b
            if (c > b) {
                System.out.println(b + " is smallest number");
            } else {
                System.out.println(c + " is smallest number");
            }
        }
        
	}

}
