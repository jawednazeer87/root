package org.la.core.java.student.waleed.homework.condition.assignment3;

public class Assign10AnotherSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int  grade =37;
		 
		System.out.println("Program to check student grades");
		
		if(grade>=80 && grade<=100) {
			System.out.println("A");
		}
		else
		{
			if(grade>=60 && grade<80) {
				System.out.println("B");
			}
			else {
				
				if(grade>=50 && grade<60) {
					System.out.println("c");
				}
				else { 
					if(grade>=45 && grade<50)
					{
						System.out.println( "D");
					}
					else {
						if(grade>=25 && grade<45) {
							System.out.println("E");
						}
						else { if (grade <25) {
							System.out.println("F");}
						else  {System.out.println("Not correct marks");}
						}
						}
				    }
				  }
			}
		
		System.out.println("end");
	}
}
