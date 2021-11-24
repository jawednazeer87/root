package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap11Avg2num {

	public static void main(String[] args) {
		int num1, num2;
		float avg;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter two number ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	
		avg = (float)(num1 + num2)/2;
				
		System.out.println(" Average of"+num1+" & " + num2+" = "+avg);

	}

}
