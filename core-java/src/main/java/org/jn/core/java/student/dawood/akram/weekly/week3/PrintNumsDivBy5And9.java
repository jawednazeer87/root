package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsDivBy5And9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=10;num<=50;num++) {
        	if(num%5==0 && num%9==0) {
        		System.out.println(num+" is divisible by both 5 and 9.");
        	}
        }
	}

}