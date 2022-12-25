package org.jn.core.java.student.dawood.akram.weekly.week3;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 7;
        int factorial = 1;
        while(true) {
        			if(num==0) {
        				break;
        			}
        			factorial = factorial*num;
        			num--;
        }
        System.out.println("Factorial of the given number is : "+factorial);
	}

}
