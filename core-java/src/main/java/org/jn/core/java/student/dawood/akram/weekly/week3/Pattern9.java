package org.jn.core.java.student.dawood.akram.weekly.week3;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=2;i++) {
        	for(int j=1;j>=i;j--) {
        	System.out.print("  ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print(" "+k);
        	}
        	System.out.println();
        }
        for(int i=1;i<=1;i++) {
        	for(int j=1;j>=i;j--) {
        		System.out.print("  ");
        	}
        	for(int k=1;k<=3;k++) {
        		System.out.print(" "+k);
        	}
        }
	}

}
