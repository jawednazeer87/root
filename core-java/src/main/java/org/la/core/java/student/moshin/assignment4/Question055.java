package org.la.core.java.student.moshin.assignment4;

public class Question055 
{
	//55.	Wap to count number of digits in a number.

    public static void main(String[] args) {

        int num = 123455477, count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }
}

