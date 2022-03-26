package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class HCFfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b=sc.nextInt();
		
		if(a<b) {
			c=a;
			a=b;
			b=c;
		}
		
		while(true) {
			c=a%b;
			a=b;
			b=c;
			
			if(b==0) {
				System.out.println("HCF "+a);
				break;
			}
		}

	}

}
