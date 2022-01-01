package org.la.core.java.student.moshin.assignment4;

public class Question043 
{
	//43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero
    public static void main(String[] args) {
        int s = 0, n = 12345;
        while (n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.println(s);
    }
}

