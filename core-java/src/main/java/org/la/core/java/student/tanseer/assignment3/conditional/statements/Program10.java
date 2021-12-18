package org.la.core.java.student.tanseer.assignment3.conditional.statements;


public class Program10 {

	public static void main(String[] args) 
	{
		int score = 87 ;
		System.out.println("Grade and marks : \n");
	
		if((score >= 80) && (score < 100)) 
		System.out.println("A grade score is : " +score);
		
		else if((score >= 60) && (score < 80)) 
			System.out.println("B grade score is : " +score);
		
		else if((score > 50) && (score < 60)) 
			System.out.println("C grade score is : " +score);
		
		else if((score > 45) && (score < 50)) 
			System.out.println("D grade score is : " +score);
		
		else if((score > 25) && (score < 45)) 
			System.out.println("D grade score is : " +score);
		
		else if((score < 25) ) 
			System.out.println("F grade score is : " +score);
	}

}
