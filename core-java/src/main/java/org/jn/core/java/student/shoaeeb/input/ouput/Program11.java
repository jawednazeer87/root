package org.jn.core.java.student.shoaeeb.input.ouput;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter Salary: ");
		float sal = sc.nextFloat();
		
		System.out.printf("Id: %d"+" Name: %s"+ " Salary:%s ",id,name,sal);
		
	}

}
