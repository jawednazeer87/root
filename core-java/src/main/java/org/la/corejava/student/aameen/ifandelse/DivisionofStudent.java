package org.la.corejava.student.aameen.ifandelse;

import java.util.Scanner;
public class DivisionofStudent {

	public static void main(String[] args) {
		// wap to find divistion secured by a student
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your total percent obtained ");
		int num = sc.nextInt();
		if(num>=80)
			System.out.println("1st Division");
		else if(num>=60)
			System.out.println("2nd Division");
		else if(num>=40)
			System.out.println("3rd division");
		else
			System.out.println("Fail");
		
	}

}
