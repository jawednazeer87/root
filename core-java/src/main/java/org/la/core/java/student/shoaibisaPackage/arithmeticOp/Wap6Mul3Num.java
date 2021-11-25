package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap6Mul3Num {

	public static void main(String[] args) {
		int num1, num2,num3, sol;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter three number ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sol = num1 * num2 *num3;
				
		System.out.println(" "+num1+" * " + num2+"*"+ num3+" = "+sol);
	}

}
