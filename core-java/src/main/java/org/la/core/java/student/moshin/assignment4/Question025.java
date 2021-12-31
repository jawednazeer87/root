package org.la.core.java.student.moshin.assignment4;

public class Question025 
{

    public static void main(String[] args) {
//25.	wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 11 != 0) {
                System.out.println(i);
            }
        }
    }
}
    

