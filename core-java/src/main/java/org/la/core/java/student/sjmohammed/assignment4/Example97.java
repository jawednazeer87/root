package org.la.core.java.student.sjmohammed.assignment4;

public class Example97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 31, b = 40;
        int c = b - a; //40-31=9

        b = c % a; //9%31=9

        b = b / a;//9/31 = 0

        a = ++c;//10

        b = (a - --b) * c;//(10-(-1))*10 =11*10=110

        System.out.println("b = " + b);
	}

}
