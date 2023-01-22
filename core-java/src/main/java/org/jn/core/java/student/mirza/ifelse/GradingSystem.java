package org.jn.core.java.student.mirza.ifelse;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int mark =20;
		
		 if (mark > 80) {
			 
			 System.out.println("Grade : A");
		 }
		 else if (mark > 60) {
			 
			 System.out.println("Grade : B");
		 }
		 else if (mark > 50) {
			 System.out.println("Grade  : C");
		 }
		 else if (mark > 45) {
			 
			 System.out.println("Grade : D");
		 }
		 else if ( mark > 25) {
			 System.out.println("Grade : E");
		 }
		 else {
			 
			 System.out.println(" Grade : F");
		 }
	}

}


//A school has following rules for grading system:
//	a. Below 25 - F
	//b. 25 to 45 - E
	//c. 45 to 50 - D
//	d. 50 to 60 - C
	//e. 60 to 80 - B
	//f. Above 80 - A
	//provide marks and print the corresponding grade.