package org.jn.core.java.student.dawood.akram.weekly.week2;

public class CheckOutput35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
        int y = 10;
        double z = x++ - y * 7 / --y + x * 10; // 20-70/9+210 ==> 20-7+210 ==> 213.0
        System.out.println(z);
	}

}
