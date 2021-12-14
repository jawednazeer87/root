package org.la.core.java.student.sajid.conditional.assignment3;

public class Wap08 {

	public static void main(String[] args) {
		int firstClass = 75;
		int secondClass = 60;
		int thirdClass = 50;
				
		int studentMarks = 61;
		System.out.println("Student marks: "+studentMarks);
		
		if (studentMarks >= firstClass) {
			System.out.println("Student has passed in first class ");
			
		}else if (studentMarks >= secondClass && studentMarks < firstClass ) {
			System.out.println("Student has passed in second class ");
			
		}else if (studentMarks >= thirdClass && studentMarks < secondClass) {
				System.out.println("Student has passed in third class ");
		}
	}

}
