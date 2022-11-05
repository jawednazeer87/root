package org.jn.core.java.student.dawood.akram.weekly.week2;

public class SchoolGradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int marks = 81;
          if(marks<25) {
        	  System.out.println("You scored F Grade");
          } else if(marks>=25 && marks<=45) {
        	  System.out.println("You scored E Grade");
          }else if(marks>45 && marks<=50) {
        	  System.out.println("You scored D Grade");
          }else if(marks>50 && marks<=60) {
        	  System.out.println("You scored C Grade");
          }else if(marks>60 && marks<=80) {
        	  System.out.println("You scored B Grade");
          } else if(marks>80) {
        	  System.out.println("You scored A Grade");
          }
	}

}
