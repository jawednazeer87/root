package org.la.core.java.student.sjmohammed.assignment3;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 25;
        if (100 >= score && score > 80) {
            System.out.println("A Grade");
        } else if (score > 70) {
            System.out.println("B Grade");
        } else if (score > 60) {
            System.out.println("C Grade");
        } else if (score >=40) {
            System.out.println("D Grade");
        }
        else {
        	System.out.println("Fail");
        }
	}

}
