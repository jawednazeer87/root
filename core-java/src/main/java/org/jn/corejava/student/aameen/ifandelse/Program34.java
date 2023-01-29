package org.jn.corejava.student.aameen.ifandelse;

import java.util.Scanner;
public class Program34 {

	public static void main(String[] args) {
		// wap to print zero if number zero, 1 if positive and -1 if number is negative
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("1");
		else if(num<0)
			System.out.println("-1");
		else
			System.out.println("0");

	}

}
