package org.la.core.java.student.moshin.assignment4;

public class Question007 {
	
	// 7.	wap to print numbers which is completely divisible by 10 between 1 and 100.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
    
}

