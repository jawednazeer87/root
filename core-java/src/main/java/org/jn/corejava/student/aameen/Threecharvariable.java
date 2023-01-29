package org.jn.corejava.student.aameen;

import java.util.Scanner;

public class Threecharvariable {

	public static void main(String[] args) {
		// wap to declare 3 char variables and assign any value and print it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of first char variable");
		char firstvalue = sc.next().charAt(0);
		System.out.println("Enter the value of second char variable");
		char secondvalue = sc.next().charAt(0);
		System.out.println("Enter the value of third char variable");
		char thirdvalue = sc.next().charAt(0);
		
		System.out.println("The value of all three char variable are :" +firstvalue+ ";"+secondvalue +";" +thirdvalue);
		
	}

}
