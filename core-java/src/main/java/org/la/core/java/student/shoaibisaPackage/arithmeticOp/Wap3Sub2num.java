package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap3Sub2num {

	public static void main(String[] args) {
		int num1, num2, sol;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter two number ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sol = num1 - num2;
		System.out.println(" "+num1+" - " + num2+" = "+sol);

	}

}
