package org.la.core.java.student.moshin.assignment4;

public class Question027 
{

	public static void main(String[] args) {
		//27.	wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.
	    
	
        for (int i = 1; i <= 1500; i++) {
            if (i % 13 == 0 && i % 11 == 0) {
                System.out.println(i);
            }
        }
	}
}

