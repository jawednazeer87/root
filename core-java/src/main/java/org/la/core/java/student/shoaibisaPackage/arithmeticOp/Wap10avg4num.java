package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap10avg4num {

	public static void main(String[] args) {
		int num1, num2,num3, num4;
		float avg;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter four number ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		avg = (float)(num1 + num2+num3+num4)/4;
				
		System.out.println(" Average of"+num1+", " + num2+", "+ num3+" & "+num4+" = "+avg);

	}

}
