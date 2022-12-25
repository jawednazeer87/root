package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 27 / 4 + 9;//6+9=15
        int b = 52 / 6 - 3;//8-3=5
        int c = 3;
        c = a++ - b; //15-5 = 10
        a = a * b; //16*5 = 80
        b = b + a; // 5+80 = 85
        a = (a < c) ? a % c : c % a; //10%80 = 1
        System.out.println("a = " + a + " b = " + b + " c = " + c);// a=10, b=85, c=10
	}

}
