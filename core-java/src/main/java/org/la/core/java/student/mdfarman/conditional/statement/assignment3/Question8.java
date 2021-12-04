package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question8 {

	public static void main(String[] args) {
//		8.	wap to find divistion secured by a student
		int per = 101;
		
		if(per >= 70 && per <= 100)
			System.out.println("Grade : O");
			
		else if (per >= 60 && per < 70) 
            System.out.println("Grade : A");
        
		else if (per >= 50 && per < 60) 
            System.out.println("Grade : B");
        
		else if (per >= 40 && per < 50) 
            System.out.println("Grade : C");
        
		else if( per >= 0 && per < 40)
            System.out.println("Grade : F");
		else
			System.out.println("Please enter valid percentage");
        

	}

}
