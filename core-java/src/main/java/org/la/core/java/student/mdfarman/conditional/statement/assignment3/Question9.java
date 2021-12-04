package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question9 {

	public static void main(String[] args) {
//		9.	wap to for a given length and breadth of a rectangle check if it is square or not.		
		
		int leng = 3 , bre = 5;
		
		if (leng<=0 || bre <= 0)
			System.out.println("Please enter valid length and breath ");
		
		else if(leng == bre)
			System.out.println("It is a square");
		else
			System.out.println("It is a rectangle");
		
		
        

	}

}
