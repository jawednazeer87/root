package org.la.core.java.student.moshin.assignment4;

public class Question044 
{
	//44.	wap to find sum of a number e.g ip=1234,  op=10
    public static void main(String[] args) {
        int s = 0, n = 1234;
        while (n > 0) {
            int r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println(s);
    }
}

