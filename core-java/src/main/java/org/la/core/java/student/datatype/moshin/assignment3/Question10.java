package org.la.core.java.student.datatype.moshin.assignment3;

public class Question10 {

	public static void main(String[] args) {
		
		int score = 75;
        if (100 >= score && score >= 80) {
            System.out.println("A level");
        } else if (score >= 60) {
            System.out.println("B level");
        } else if (score > 50 && score < 60) {
            System.out.println("C level");
        } else if (score < 50 && score >= 45) {
            System.out.println("D level");
        } else if (score < 45 && score >= 25) {
            System.out.println("E level");
        } else if (score < 25) {
            System.out.println("F level");
        }

	}

}
