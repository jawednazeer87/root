package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsNotDivBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int num=30;num<=50;num++) {
        	 if(num%7==0) {
        		 continue;
        	 } else {
        		 System.out.println(num+" is not divisible by 7");
        	 }
         }
	}

}
