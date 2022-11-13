package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsDivBy11And3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int num=100;num>=1;num--) {
        	if(num%11==0 && num%3==0) {
        		System.out.println(num+" is divisible by both 11 and 3.");
        	}
        }
	}

}
