package org.jn.corejava.student.aameen.ifandelse;

import java.util.Scanner;
public class SquareorNot {

	public static void main(String[] args) {
		// wap to for a given length and breadth of a rectangle check if it is square or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length ");
		int length=sc.nextInt();
		System.out.println("Enter the breadth ");
		int breadth = sc.nextInt();
		if(length==breadth)
		System.out.println("It is a square ");
		else
			System.out.println("It is not a square ");
		
	}

}
