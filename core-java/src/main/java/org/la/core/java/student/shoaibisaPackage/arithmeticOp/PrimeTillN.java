package org.la.core.java.student.shoaibisaPackage.arithmeticOp;

import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,flag=0,i,j;
		
		Scanner sc = new Scanner(System.in);
		
	 m = sc.nextInt();
		
		for(i=2; i<=m; i++) {
			flag=0;
			for(j=2; j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println("Prime "+j);
			}
		}
	}

}
