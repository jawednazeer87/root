package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) 
	{
		int percent ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage :");
		percent = sc.nextInt();
		if ((percent > 60 && (percent <= 99))) 
		{
			System.out.println("1st Division :" +percent);
		} 
		else 
		{
			if((percent >= 50 && (percent <= 60 ))) 
			{
				System.out.println("2nd Division :" +percent);	
			}
			else if((percent >= 30 && (percent <= 40 ))){
				System.out.println("3rd Division :" +percent);
			}
			else
				System.out.println("Fail "+ percent);
		}
	
		sc.close();
	}

}
