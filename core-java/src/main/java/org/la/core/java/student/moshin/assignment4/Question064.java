package org.la.core.java.student.moshin.assignment4;

public class Question064 
{
	//64.	Wap to find power of a number using for loop.

    public static void main(String[] args) {

        int a = 3, pow = 5, result = 1;
        for (int i = 0; i < pow; i++) {
            result *= a;
        }
        System.out.println("result = " + result);
    }
}

