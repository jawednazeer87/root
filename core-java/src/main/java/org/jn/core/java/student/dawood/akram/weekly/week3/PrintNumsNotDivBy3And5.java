package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsNotDivBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int num=10;num<=70;num++) {
        	if(num%3!=0 && num%5!=0) {
        		System.out.println(num+" is not divisible by both 3 and 5.");
        	}
        }
	}

}
