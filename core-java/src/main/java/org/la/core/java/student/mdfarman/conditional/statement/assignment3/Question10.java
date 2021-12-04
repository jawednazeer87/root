package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question10 {

	public static void main(String[] args) {
//		10.	A school has following rules for grading system:
//		a. Below 25 - F
//		b. 25 to 45 - E
//		c. 45 to 50 - D
//		d. 50 to 60 - C
//		e. 60 to 80 - B
//		f. Above 80 - A
//		provide marks and print the corresponding grade.
		
		int per = -24;
		
		if(per >= 80 )
			System.out.println("Grade : A");
			
		else if (per >= 60 && per < 80) 
            System.out.println("Grade : B");
        
		else if (per >= 50 && per < 60) 
            System.out.println("Grade : C");
        
		else if (per >= 45 && per < 50) 
            System.out.println("Grade : D");
        
		else if( per >= 25 && per < 45)
            System.out.println("Grade : E");
		
		else if( per >= 0 && per < 25)
            System.out.println("Grade : F");
		
		else
			System.out.println("Please enter valid percentage");
        

	}

}
