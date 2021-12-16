package org.la.core.java.student.hasan.assignment03;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=19;
		if (marks>80)
			System.out.println("A");
		else if (marks>=60 && marks<=80)
			System.out.println("B");
		else if (marks>=50 && marks<60)
			System.out.println("C");
		else if (marks>=45 && marks<50)
			System.out.println("D");
		else if (marks>=25 && marks<45)
			System.out.println("E");
		else 
			System.out.println("F");
	}

}
