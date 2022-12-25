package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsDivBy11And13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int num=1; num<=1500;num++) {
    	  if(num%11==0 && num%13==0) {
    		  System.out.println(num+" is divisible by 11 and 13");
    	  }
      }
	}

}
