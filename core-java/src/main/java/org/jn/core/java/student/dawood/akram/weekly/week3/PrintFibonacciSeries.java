package org.jn.core.java.student.dawood.akram.weekly.week3;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count = 8;
         int num1 = 0;
         int num2 = 1;
         System.out.print(num1+ " "+num2+ " ");
         int num3;
         while(true) {
        	 if(count==0) {
        		 break;
        	 }
        	 num3 = num1+num2; 
        	 num1=num2;     	 
        	 num2=num3;
        	 count--;
        	 System.out.print(num3+ " ");
         }
	}

}
