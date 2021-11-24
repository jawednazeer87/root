package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class Wap7remainderOfNum {

	public static void main(String[] args) {
		int num,div, rem;
		Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Enter dividend number ");
		div = sc.nextInt();
		System.out.println("Enter divisor number ");
		num = sc.nextInt();
		rem = div%num;
		System.out.println(" remainder of  "+div+"/"+num+" = "+rem);
		
	}

}
