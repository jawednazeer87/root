package org.la.core.java.student.moshin.assignment4;

public class Question067 
{
	//67.	Wap to print all Prime numbers between 1 to n.

    public static void main(String[] args) {

        int numMax = 101;

        int i;
        for (int num = 2; num <= numMax; num++) {

            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}

