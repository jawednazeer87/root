package org.la.core.java.student.sjmohammed.assignment4;

public class Example44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int s = 0, n = 52421;
        while (n > 0) {
            int r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println(s);
	}

}
