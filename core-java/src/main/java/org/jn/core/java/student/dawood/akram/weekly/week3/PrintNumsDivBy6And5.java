package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsDivBy6And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int num=30;num<=80;num++) {
        	if(num%5==0 && num%6==0) {
        		System.out.println(num+" is divisible by both 5 and 6.");
        	}
        }
	}

}
