package org.jn.core.java.student.dawood.akram.weekly.week3;

public class FindPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 3;
         int flag = 0;
         
         if(num==0 || num==1) {
        	 System.out.println(num+" is not a Prime.");
         } else {
        	 for(int i=2;i<num-1;i++) {
        		 if(num%i==0) {
        			 System.out.println(num+" is not a Prime");
        			 flag=1;
        		 }
        	 }
         }
        	  if(flag==0) {
        		  System.out.println(num+" is a Prime Number.");
        	  }
          
	}

}
