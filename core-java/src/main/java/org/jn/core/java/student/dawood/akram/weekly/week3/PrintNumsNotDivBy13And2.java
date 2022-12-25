package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintNumsNotDivBy13And2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=200;num>=1;num--) {
	    	   if(num%13!=0 && num%2!=0) {
	    		   System.out.println(num+" is not divisible by both 13 and 2.");
	    	   }
	}

}
}
