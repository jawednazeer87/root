package org.jn.core.java.student.dawood.akram.weekly.week3;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=2;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        for(int i=1;i<=1;i++) {
        	for(int j=4;j>=i;j--) {
        		if(j==4) {
        			System.out.print(" ");
        		} else {
        		
        		System.out.print(" 3");
        		}
        	}
        }
	}

}
