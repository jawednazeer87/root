package org.la.core.java.student.moshin.assignment4;

public class Question017 {
	
	//17.	wap to print all numbers between 30 to 50 those are not divisible by 7.

    public static void main(String[] args) {

        for (int i = 30; i <= 50; i++) {
            if (i%7!=0){
                System.out.println(i);
            }
        }
    }
    
}
