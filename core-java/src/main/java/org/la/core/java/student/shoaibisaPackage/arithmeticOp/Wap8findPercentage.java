package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap8findPercentage {

	public static void main(String[] args) {
		int num1,num2;
		float per;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter 1st number ");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number ");
		num2 = sc.nextInt();
		per = ((float)num1/num2)*100;
		System.out.println(" percentage of  "+num1+"/"+num2+" = "+per+"%");

	}

}
