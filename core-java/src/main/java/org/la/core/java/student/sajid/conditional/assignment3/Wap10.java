package org.la.core.java.student.sajid.conditional.assignment3;

public class Wap10 {

	public static void main(String[] args) {
		int A = 80;
		int B = 60;
		int C = 50;
		int D = 45;
		int E = 25;
	
		int studentMarks = 23;
		
		System.out.println("Student Marks: "+studentMarks );
		
		if (studentMarks > A) {
			System.out.println("Student has passed in grade A");
		}else if (studentMarks <= A && studentMarks > B) {
			System.out.println("Student has passed in grade B");
		}else if (studentMarks <= B && studentMarks > C) {
			System.out.println("Student has passed in grade C");
		}else if (studentMarks <= C && studentMarks > D) {
			System.out.println("Student has passed in grade D");
		}else if (studentMarks <= D && studentMarks > E) {
			System.out.println("Student has passed in grade E");
		}else if (studentMarks < E) {
			System.out.println("Student has failed");
	}
	}
}
