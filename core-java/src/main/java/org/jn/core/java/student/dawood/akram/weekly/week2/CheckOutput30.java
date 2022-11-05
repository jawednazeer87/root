package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, e = 50;
        boolean b = (c == 1) || (++e < 100);
        System.out.println("e = " + e);
        boolean f = (e++ < 100) || (c == 1);
        System.out.println("e = " + e);
	}

}
