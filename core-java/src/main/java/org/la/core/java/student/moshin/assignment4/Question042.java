package org.la.core.java.student.moshin.assignment4;

public class Question042 
{
	
	//42.	wap to find given number is prime or not
    public static void main(String[] args) {
        int num = 71;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
}

