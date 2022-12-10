package org.jn.core.java.student.dawood.akram.weekly.week3;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            for(int i=1;i<=4;i++) {
            	for(int j=1;j<=i;j++) {
            		System.out.print(" ");
            	}
            	for(int k=4;k>=i;k--) {
            		System.out.print("*");
            	}
            	System.out.println();
            }
	}

}
