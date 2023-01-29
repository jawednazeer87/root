package org.jn.corejava.student.aameen.ifandelse;

import java.util.Scanner;
public class GradingSystem {

	public static void main(String[] args) {
		// Grading system in school
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade marks ");
		int grade = sc.nextInt();
		if(grade <25)
			System.out.println("F");
		else if((grade<45)&&(grade>=25))
			System.out.println("E");
		else if((grade<50)&&(grade>=45))
			System.out.println("D");
		else if((grade<60)&&(grade>=50))
			System.out.println("C");
		else if((grade<=80)&&(grade>=60))
			System.out.println("B");
		else
			System.out.println("A");
		
		
	}

}
