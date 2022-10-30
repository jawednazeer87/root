package org.la.corejava.student.aameen;

import java.util.Scanner;
public class Threevariabledeclare {

	public static void main(String[] args) {
		//  wap to declare 3 int variables and assign any value and print it
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of first int variable");
		int firstvalue = sc.nextInt();
		System.out.println("Enter the value of second int variable");
		int secondvalue = sc.nextInt();
		System.out.println("Enter the value of third int variable");
		int thirdvalue = sc.nextInt();
		
		System.out.println("The value of all three int variable are :" +firstvalue+ ";"+secondvalue +";" +thirdvalue);
		

	}

}
