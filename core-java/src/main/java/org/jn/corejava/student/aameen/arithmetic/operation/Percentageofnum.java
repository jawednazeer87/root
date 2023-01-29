package org.jn.corejava.student.aameen.arithmetic.operation;

import java.util.Scanner;

public class Percentageofnum {

	public static void main(String[] args) {
		// wap to find percentage 
		float scoredmarks,totalmark,percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the scored marks:");
		scoredmarks = sc.nextFloat();
		System.out.println("Enter the total marks :");
		totalmark = sc.nextFloat();
		
		percentage = (float)(scoredmarks/totalmark)*100;
		
		System.out.println("Percentage of given number : "+percentage);

	}

}
