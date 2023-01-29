package org.jn.corejava.student.aameen.arithmetic.operation;

public class PostincreementCode {

	public static void main(String[] args) {
		// wap to do post increment a number and assign its value to other number and print both number	
		int num = 32;
		System.out.println("Assign Number : "+num);
		System.out.println(" ");
		int afternum = num++;
		System.out.println("Another Assign Number after post increement is : "+afternum);
		System.out.println(" ");
		System.out.println("Assign Number after post increement : "+ num);
	}

}