package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) 
	{
		int len , bre , area ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		len = sc.nextInt();
		
		System.out.println("Enter Breath : ");
		bre = sc.nextInt();
		
		area = (len * bre);
		System.out.println("Area of rectangle : \n" +area);
		
		if (len == bre) {
			System.out.println("Its a sqauare : " + " lenght = " + len + " breath = " + bre);
		} else {
			System.out.println("Its not a sqauare : " + " lenght = " + len + " breath = " + bre);
		}
		
		sc.close();
	}

}
